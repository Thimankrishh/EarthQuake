package com.thiman.android.earthquake;

/**
 * Created by Asus on 12/8/2017.
 */

public class Earthquake {
    private String mMagnitude;

    private String mLocation;


    private long mTimeInMiliseconds;

    public Earthquake(String vMagnitude, String vLocation, long vTimeInMiliseconds) {
        this.mMagnitude = vMagnitude;
        this.mLocation = vLocation;
        this.mTimeInMiliseconds = vTimeInMiliseconds;

    }

    public String getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public long getmTimeInMiliseconds() {
        return mTimeInMiliseconds;
    }
}
