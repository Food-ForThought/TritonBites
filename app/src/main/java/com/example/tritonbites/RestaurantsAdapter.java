package com.example.tritonbites;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.parse.ParseFile;

import java.util.List;

public class RestaurantsAdapter extends RecyclerView.Adapter<RestaurantsAdapter.ViewHolder>
{
    private Context context;
    private List<Restaurants> restaurants;

    public RestaurantsAdapter(Context context, List<Reviews> reviews)
    {
        this.context = context;
        this.restaurants = restaurants;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_restaurant, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Restaurants restaurant = restaurants.get(position);
        holder.bind(restaurant);
    }

    @Override
    public int getItemCount() {
        return 0;
    }


    class ViewHolder extends RecyclerView.ViewHolder
    {
        private TextView tvPlace;
        private TextView tvRestaurant;
        private TextView tvRestaurant2;
        private TextView tvRestaurant3;
        private RatingBar resRatingBar;
        private RatingBar resRatingBar2;
        private RatingBar resRatingBar3;

        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            tvPlace = itemView.findViewById(R.id.tvPlace);
            tvRestaurant = itemView.findViewById(R.id.tvRestaurant);
            tvRestaurant2 = itemView.findViewById(R.id.tvRestaurant2);
            tvRestaurant3 = itemView.findViewById(R.id.tvRestaurant3);
            resRatingBar = itemView.findViewById(R.id.resRatingBar);
            resRatingBar2 = itemView.findViewById(R.id.resRatingBar2);
            resRatingBar3 = itemView.findViewById(R.id.resRatingBar3);
        }

        public void bind(Restaurants restraunt) {
            tvPlace.setText(restraunt.getCollege());
            tvRestaurant.setText(restraunt.getRestaurant());
            tvRestaurant2.setText(restraunt.getRestaurant());
            tvRestaurant3.setText(restraunt.getRestaurant());
            tvPlace.setText(restraunt.getRestaurant());
            tvPlace.setText(restraunt.getRestaurant());
            resRatingBar.setRating((float)restraunt.getRating());
            resRatingBar2.setRating((float)restraunt.getRating());
            resRatingBar2.setRating((float)restraunt.getRating());
        }
    }
}