package com.example.tritonbites;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@ParseClassName("Restaurant")
public class Restaurants extends ParseObject {
    public static final String KEY_RESTAURANT = "restaurant";

    public String getRestaurant()
    {
        return getString(KEY_RESTAURANT);
    }

}
