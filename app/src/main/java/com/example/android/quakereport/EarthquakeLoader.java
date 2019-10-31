package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {
    String queryURL ;
    public EarthquakeLoader(Context context,String u) {
        super(context);
        queryURL=u;


    }

    @Override
    public List<Earthquake> loadInBackground() {

        Log.v("url",queryURL);
       // List<Earthquake> list = QueryUtils.fetchEarthquakeData("https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&eventtype=earthquake&orderby=time&minmag=6&limit=10");

        List<Earthquake> list = QueryUtils.fetchEarthquakeData(queryURL);
        return list;
    }
}
