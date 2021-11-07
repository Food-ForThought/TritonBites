package com.example.tritonbites.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.tritonbites.R;

public class FoodDetailFragment extends Fragment
{
    public static final String TAG = "Food Detail Fragment";

    private TextView tvFoodName;
    private ImageView ivFoodItem;
    private RatingBar rbTaste;
    private RatingBar rbTime;
    private RatingBar rbValue;
    private TextView tvStarTaste;
    private TextView tvStarTime;
    private TextView tvStarValue;
    private TextView tvFoodDescription;
    private TextView tvReviews;
    //private RecyclerView rvReviews;

    public FoodDetailFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_food_detail, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);

        tvFoodName = view.findViewById(R.id.tvFoodName);
        ivFoodItem = view.findViewById(R.id.ivFoodItem);
        rbTaste = view.findViewById(R.id.rbTaste);
        rbTime = view.findViewById(R.id.rbTime);
        rbValue = view.findViewById(R.id.rbValue);
        tvStarTaste = view.findViewById(R.id.tvStarTaste);
        tvStarTime = view.findViewById(R.id.tvStarTime);
        tvStarValue = view.findViewById(R.id.tvStarValue);
        tvFoodDescription = view.findViewById(R.id.tvFoodDescription);
        tvReviews = view.findViewById(R.id.tvReview);
        //rvReviews = view.findViewById(R.id.rvReviews);
    }

}
