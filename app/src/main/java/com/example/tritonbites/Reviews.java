package com.example.tritonbites;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@ParseClassName("Review")
public class Reviews extends ParseObject
{
    public static final String KEY_USER = "user";
    public static final String KEY_TASTE = "taste_rating";
    public static final String KEY_TIME = "time_rating";
    public static final String KEY_VALUE = "value_rating";
    public static final String KEY_IMAGE = "food_image";
    public static final String KEY_REVIEW = "review_text";
    public static final String KEY_UPVOTE = "upvotes";
    public static final String KEY_CREATED = "createdAt";

    public ParseUser getUser()
    {
        return getParseUser(KEY_USER);
    }

    public void setUser(ParseUser user)
    {
        put(KEY_USER, user);
    }

    public String getReview()
    {
        return getString(KEY_REVIEW);
    }

    public void setReview(String review)
    {
        put(KEY_REVIEW, review);
    }

    public void setTaste(int taste)
    {
        put(KEY_TASTE, taste);
    }

    public int getTaste()
    {
        return getInt(KEY_TASTE);
    }

    public void setTime(int time)
    {
        put(KEY_TIME, time);
    }

    public int getTime()
    {
        return getInt(KEY_TIME);
    }

    public void setValue(int value)
    {
        put(KEY_VALUE, value);
    }

    public int getValue()
    {
        return getInt(KEY_VALUE);
    }

    public ParseFile getImage()
    {
        return getParseFile(KEY_IMAGE);
    }

    public void setImage(ParseFile parseFile)
    {
        put(KEY_IMAGE, parseFile);
    }

    public void setUpvote()
    {
        int upvote;
        upvote = getUpvote() + 1;
        put(KEY_TASTE, upvote);
    }

    public int getUpvote()
    {
        return getInt(KEY_UPVOTE);
    }

    public String getDate()
    {
        Date date = getCreatedAt();
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        String reportDate = df.format(date);
        return reportDate;
    }
}
