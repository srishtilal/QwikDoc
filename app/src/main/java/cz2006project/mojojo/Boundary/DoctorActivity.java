package main.java.cz2006project.mojojo.Boundary;

/**
 * Created by srishti on 31/3/15.
 */

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v4.app.FragmentManager;
        import android.support.v4.widget.DrawerLayout;
        import android.support.v7.app.ActionBar;
        import android.support.v7.app.ActionBarActivity;
        import android.support.v7.widget.Toolbar;
        import android.util.Log;
        import android.view.Menu;
        import android.view.MenuItem;

        import com.parse.ParseFacebookUtils;
        import com.parse.ParseUser;


        import cz2006project.mojojo.R;
        import main.java.cz2006project.mojojo.Control.SampleApplication;
        import main.java.cz2006project.mojojo.NavigationDrawerFragment;


public class DoctorActivity extends ActionBarActivity
        implements NavigationDrawerFragment.NavigationDrawerCallbacks {

    public static final String TAG = "DoctorActivity";
    public static final boolean DEBUG = SampleApplication.LOG_DEBUG;
    public static final boolean INFO = SampleApplication.LOG_INFO;
    private ParseUser currentUser;


    String[] paths;
    Toolbar toolbar;
    /**
     * Fragment managing the behaviors, interactions and presentation of the navigation drawer.
     */
    private NavigationDrawerFragment mNavigationDrawerFragment;
    /**
     * Used to store the last screen title. For use in {@link #restoreActionBar()}.
     */
    private CharSequence mTitle;
    private String myTitle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_exp);

        myTitle = getString(R.string.app_name);
        if (toolbar == null) {
            toolbar = (Toolbar) findViewById(R.id.toolbar);
            if (toolbar != null) {
                setSupportActionBar(toolbar);
                toolbar.setTitle(myTitle);
                toolbar.setTitleTextColor(getResources().getColor(R.color.white));
                //if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                //    toolbar.setElevation(10f); }

            }
        }


        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getSupportFragmentManager().findFragmentById(R.id.navigation_drawer);
        mTitle = getResources().getString(R.string.scheduled_appointments);

        // Set up the drawer.
        mNavigationDrawerFragment.setUp(
                R.id.navigation_drawer,
                (DrawerLayout) findViewById(R.id.drawer_layout));


    }


    @Override
    public void onNavigationDrawerItemSelected(int position) {
        // update the main content by replacing fragments
        FragmentManager fragmentManager = getSupportFragmentManager();
        switch (position) {
            case 0:
            default:
                if (DEBUG) Log.d(TAG, "scheduled appointment fragment");
                mTitle = "Scheduled Appointments";
                fragmentManager.beginTransaction()
                        .replace(R.id.container, ScheduledAppointmentsFragment.newInstance())
                        .commit();
                break;
            case 1:
                if (DEBUG) Log.d(TAG, "medical records fragment");
                mTitle = "Patient Medical Records";
                fragmentManager.beginTransaction()
                        .replace(R.id.container, new MedicalRecordSearchFragment())
                        .commit();
                break;
            case 2:
                if (DEBUG) Log.d(TAG, "myprofile fragment");
                mTitle = "Profile";
                fragmentManager.beginTransaction()
                        .replace(R.id.container, new ProfileFragment())
                        .commit();
                break;



        }

    }

    public void onSectionAttached(int number) {
        switch (number) {
            case 1:
                mTitle = getString(R.string.patient_medical_records);
                break;
            case 2:
                mTitle = getString(R.string.profile);
                break;
            case 3:
                mTitle = getString(R.string.logout);
                break;

        }
    }

    public void restoreActionBar() {
        //ActionBar actionBar = getSupportActionBar();
        //actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        //actionBar.setDisplayShowTitleEnabled(true);
        //actionBar.setTitle(mTitle);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.toolbar.setTitle(mTitle);
        this.getSupportActionBar().setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!mNavigationDrawerFragmentDoctor.isDrawerOpen()) {
            // Only show items in the action bar relevant to this screen
            // if the drawer is not showing. Otherwise, let the drawer
            // decide what to show in the action bar.
            getMenuInflater().inflate(R.menu.menu_main, menu);
            restoreActionBar();
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_signout) {
            ParseUser.logOut();
            currentUser = null;
            Intent i = new Intent(this, SampleProfileActivity.class);
            startActivity(i);
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 131077 && resultCode == Activity.RESULT_OK) {
            paths = data.getStringArrayExtra("all_path");
        }
        super.onActivityResult(requestCode, resultCode, data);

    }

}