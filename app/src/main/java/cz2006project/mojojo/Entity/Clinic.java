package main.java.cz2006project.mojojo.Entity;

import java.util.ArrayList;

/**
 * Created by Dhruv on 2/24/2015.
 */
public class Clinic {

    private ArrayList<Doctor> doctorList = new ArrayList<Doctor>();
    private ArrayList<Admin> adminList = new ArrayList<Admin>();
    private String Location;


    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }

    public ArrayList<Admin> getAdminList() {
        return adminList;
    }

    public void setAdminList(ArrayList<Admin> adminList) {
        this.adminList = adminList;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }


}