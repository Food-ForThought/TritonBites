package com.example.tritonbites.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.tritonbites.R;


public class RestaurantDetailFragment extends Fragment {
    public static final String TAG = "Restaurant Detail Fragment";

    private Button btPhoto;
    private Button btCheckIn;
    private Button btFavorite;
    private RatingBar ratingBar;
    //private RecyclerView rvInfo;

    public RestaurantDetailFragment () {}


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btPhoto = view.findViewById(R.id.btPhoto);
        btCheckIn = view.findViewById(R.id.btCheckIn);
        btFavorite = view.findViewById(R.id.btFavorite);
        ratingBar = view.findViewById(R.id.ratingBar);
        //rvInfo = view.findViewById(R.id.rvInfo);
    }
}