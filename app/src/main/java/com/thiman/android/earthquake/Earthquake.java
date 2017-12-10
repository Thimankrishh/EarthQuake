package com.thiman.android.earthquake;

/**
 * Created by Asus on 12/8/2017.
 */

public class Earthquake {
    private String mMagnitude;

    private String mLocation;


    private String mDate;

    public Earthquake(String vMagnitude, String vLocation, String vDate) {
        this.mMagnitude = vMagnitude;
        this.mLocation = vLocation;
        this.mDate = vDate;

    }

    public String getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public String getmDate() {
        return mDate;
    }
}
