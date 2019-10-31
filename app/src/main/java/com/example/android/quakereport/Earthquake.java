package com.example.android.quakereport;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Earthquake {

    
    private String location;
    private double magnitude;
    private String date;
    private String url="";

    public Earthquake(String l, double m, String d)
    {
        location = l;
        magnitude=Double.parseDouble( new DecimalFormat("0.00").format( magnitude));
        date=d;

    }
    public Earthquake( String location, double magnitude,long timeInMilliseconds) {
        this.magnitude =Double.parseDouble( new DecimalFormat("0.00").format( magnitude));
        this.location = filterLocation(location);
        Date dateObject = new Date(timeInMilliseconds);
        SimpleDateFormat dateFormatter = new SimpleDateFormat("EEE, MMM d, ''yy");
        String dateToDisplay = dateFormatter.format(dateObject);
        this.date = dateToDisplay;
    }
    public Earthquake( String location, double magnitude,long timeInMillisecond,String url) {
        this(location,magnitude,timeInMillisecond);
        this.url = url;
    }
    public double getMagnitude() {
        return magnitude;
    }

    public String getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }
    public  String filterLocation(String s)
    {
        if(s.contains("of "))
            s =s.substring(s.indexOf("of ")+3);

        return  s;

    }

    public String getUrl() {
        return url;
    }
}
