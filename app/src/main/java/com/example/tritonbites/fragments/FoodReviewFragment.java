package com.example.tritonbites.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tritonbites.R;
import com.example.tritonbites.Reviews;
import com.example.tritonbites.ReviewsAdapter;
import com.parse.FindCallback;
import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseQuery;

import java.util.ArrayList;
import java.util.List;

public class FoodReviewFragment extends Fragment
{
    public static final String TAG = "FoodReviewFragment";

    protected List<Reviews> allReviews;
    protected ReviewsAdapter adapter;
    private TextView tvReviewHeading;
    private RecyclerView rvReviews;

    public FoodReviewFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_food_review, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);

        tvReviewHeading = view.findViewById(R.id.tvReviewHeading);
        rvReviews = view.findViewById(R.id.rvReviews);

        allReviews = new ArrayList<>();
        adapter = new ReviewsAdapter(getContext(), allReviews);

        rvReviews.setAdapter(adapter);
        rvReviews.setLayoutManager(new LinearLayoutManager(getContext()));

        queryReviews();
    }

    protected void queryReviews() {
        ParseQuery<Reviews> query = ParseQuery.getQuery(Reviews.class);
        query.include(Reviews.KEY_USER);
        query.addDescendingOrder(Reviews.KEY_CREATED);
        query.findInBackground(new FindCallback<Reviews>() {
            //@Override
            public void done(List<Reviews> reviews, ParseException e) {
                if (e != null) {
                    Log.e(TAG, "Issue getting posts", e);
                    return;
                }

                for (Reviews review : reviews) {
                    Log.i(TAG, "Review: " + review.getReview() + "username: " + review.getUser().getUsername());
                }

                allReviews.addAll(reviews);
                adapter.notifyDataSetChanged();
            }
        });
    }
}
