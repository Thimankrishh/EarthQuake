package com.thiman.android.earthquake;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        // Create a fake list of earthquake locations.
//        ArrayList<Earthquake> earthquakes = new ArrayList<Earthquake>();
//        earthquakes.add(new Earthquake("8.6", "San Francisco", "2010.12.03"));
//        earthquakes.add(new Earthquake("8.6", "London", "2010.12.03"));
//        earthquakes.add(new Earthquake("8.6", "Tokiyo", "2010.12.03"));
//        earthquakes.add(new Earthquake("8.6", "Mexico City", "2010.12.03"));
//        earthquakes.add(new Earthquake("8.6", "Moscow", "2010.12.03"));
//        earthquakes.add(new Earthquake("8.6", "Rio de Janeiro", "2010.12.03"));
//        earthquakes.add(new Earthquake("8.6", "Paris", "2010.12.03"));
        // Get the list of earthquakes from {@Link QueryUtils }
    ArrayList<Earthquake> earthquakes = QueryUtils.extractEarthquakes();


        // Create a new adapter that takes the list  {@link ArrayAdapter} of earthquakes as input
        EarthquakeAdapter adapter = new EarthquakeAdapter(this, earthquakes);

        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.listview_earthquake);




        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(adapter);
    }
}

