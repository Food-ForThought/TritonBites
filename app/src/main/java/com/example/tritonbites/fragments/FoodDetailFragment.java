package com.example.tritonbites.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.tritonbites.MainActivity;
import com.example.tritonbites.R;

public class FoodDetailFragment extends Fragment
{
    public static final String TAG = "FoodDetailFragment";

    private TextView tvFoodName;
    private ImageView ivFoodItem;
    private RatingBar rbTaste;
    private RatingBar rbTime;
    private RatingBar rbValue;
    private TextView tvStarTaste;
    private TextView tvStarTime;
    private TextView tvStarValue;
    private Button btnReview;

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
        btnReview = view.findViewById(R.id.btnReview);

        btnReview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager2 = getFragmentManager();
                FragmentTransaction fragmentTransaction2 = fragmentManager2.beginTransaction();
                fragmentTransaction2.addToBackStack("xyz")
                        .hide(FoodDetailFragment.this).
                        add(android.R.id.content, new FoodReviewFragment()).
                        commit();
            }
        });
    }

}