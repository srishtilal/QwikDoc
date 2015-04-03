package main.java.cz2006project.mojojo.Boundary;
/*
 *  Copyright (c) 2014, Parse, LLC. All rights reserved.
 *
 *  You are hereby granted a non-exclusive, worldwide, royalty-free license to use,
 *  copy, modify, and distribute this software in source code or binary form for use
 *  in connection with the web services and APIs provided by Parse.
 *
 *  As with any software that integrates with the Parse platform, your use of
 *  this software is subject to the Parse Terms of Service
 *  [https://www.parse.com/about/terms]. This copyright notice shall be
 *  included in all copies or substantial portions of the software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 *  FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 *  COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 *  IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 *  CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 */

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import com.facebook.AppEventsLogger;
import com.parse.ParseUser;
import com.parse.ui.ParseLoginBuilder;

import cz2006project.mojojo.R;

/**
 * Shows the user profile. This simple activity can function regardless of whether the user
 * is currently logged in.
 */
/*public class SampleProfileActivity extends Activity {
    private static final int LOGIN_REQUEST = 0;

    private TextView titleTextView;
    private TextView emailTextView;
    private TextView nameTextView;
    private Button loginOrLogoutButton;

    private ParseUser currentUser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_sample_profile);
        titleTextView = (TextView) findViewById(R.id.profile_title);
        emailTextView = (TextView) findViewById(R.id.profile_email);
        nameTextView = (TextView) findViewById(R.id.profile_name);
        loginOrLogoutButton = (Button) findViewById(R.id.login_or_logout_button);
        titleTextView.setText(R.string.profile_title_logged_in);

        loginOrLogoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* if (currentUser != null) {
                    // User clicked to log out.
                    ParseUser.logOut();
                    currentUser = null;
                    //showProfileLoggedOut();
                } else {
                // User clicked to log in.

                ParseLoginBuilder loginBuilder = new ParseLoginBuilder(
                        SampleProfileActivity.this);
                startActivityForResult(loginBuilder.build(), LOGIN_REQUEST);

                }

        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        currentUser = ParseUser.getCurrentUser();
        if (currentUser.getSessionToken() != null && currentUser.getString("type").equals("Patient") ) {

            Intent patientIntent = new Intent(this, MainNavigationActivity.class);
            startActivity(patientIntent);

        }
        if (currentUser.getSessionToken() != null && currentUser.getString("type").equals("Doctor") ) {

            Intent doctorIntent = new Intent(this, DoctorActivity.class);
            startActivity(doctorIntent);
        }

            else if (currentUser.isAuthenticated() && currentUser.getString("type").equals("Doctor")) {
            Intent doctorIntent = new Intent(this, DoctorActivity.class);
            startActivity(doctorIntent);


         else {

                ParseLoginBuilder loginBuilder = new ParseLoginBuilder(
                        SampleProfileActivity.this);
                startActivityForResult(loginBuilder.build(), LOGIN_REQUEST);
            }
        }
            //showProfileLoggedOut();

    //}

    @Override
    protected void onResume() {
        super.onResume();

        // Logs 'install' and 'app activate' App Events.
        AppEventsLogger.activateApp(this);
    }


     * Shows the profile of the given user.

    private void showDoctorProfileLoggedIn() {
        titleTextView.setText(getString(R.string.profile_title_logged_in, "doctor"));
        emailTextView.setText(currentUser.getEmail());
        String fullName = currentUser.getString("name");
        if (fullName != null) {
            nameTextView.setText(fullName);
        }
        loginOrLogoutButton.setText(R.string.profile_logout_button_label);
    }

    private void showPatientProfileLoggedIn() {
        titleTextView.setText(getString(R.string.profile_title_logged_in, "patient"));
        emailTextView.setText(currentUser.getEmail());
        String fullName = currentUser.getString("name");
        if (fullName != null) {
            nameTextView.setText(fullName);
        }
        loginOrLogoutButton.setText(R.string.profile_logout_button_label);
    }

    /**
     * Show a message asking the user to log in, toggle login/logout button text.

    private void showProfileLoggedOut() {
        titleTextView.setText(R.string.profile_title_logged_out);
        emailTextView.setText("");
        nameTextView.setText("");
        loginOrLogoutButton.setText(R.string.profile_login_button_label);
    }

}*/
