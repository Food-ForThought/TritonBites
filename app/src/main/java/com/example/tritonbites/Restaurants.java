package com.example.tritonbites;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@ParseClassName("Restraunt")
public class Restaurants extends ParseObject {
    public static final String KEY_RESTAURANT = "restaurant";
    public static final String KEY_COLLEGE = "college";
    public static final String KEY_RATING = "Rating";

    public String getRestaurant()
    {
        return getString(KEY_RESTAURANT);
    }

    public String getCollege()
    {
        return getString(KEY_COLLEGE);
    }

    public int getRating()
    {
        return getInt(KEY_RATING);
    }

}
