package com.example.tritonbites;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application
{
    @Override
    public void onCreate() {

        super.onCreate();

        ParseObject.registerSubclass(Reviews.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("at42V8Y2c5JhxbYej4SxGt1hpk7Ba6Md5xYZhohE")
                .clientKey("WEGNUhskDi6ytVWDsZHFIjhWZUcsvRj6FlRUbT3t")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }

}
