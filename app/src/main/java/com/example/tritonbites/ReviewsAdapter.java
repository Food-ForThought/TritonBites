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

//import com.bumptech.glide.Glide;
import com.bumptech.glide.Glide;
import com.parse.ParseFile;

import java.util.List;

public class ReviewsAdapter extends RecyclerView.Adapter<ReviewsAdapter.ViewHolder>
{
    private Context context;
    private List<Reviews> reviews;

    public ReviewsAdapter(Context context, List<Reviews> reviews)
    {
        this.context = context;
        this.reviews = reviews;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_review, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Reviews review = reviews.get(position);
        holder.bind(review);
    }

    @Override
    public int getItemCount() {
        return reviews.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder
    {
        private TextView tvUser;
        private ImageView ivFoodImage;
        private TextView tvReviewBody;
        private TextView tvDate;
        private TextView tvUpvote;
        private RatingBar rbAvgRating;

        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            tvReviewBody = itemView.findViewById(R.id.tvReviewBody);
            tvUser = itemView.findViewById(R.id.tvUser);
            ivFoodImage = itemView.findViewById(R.id.ivFoodImage);
            tvDate = itemView.findViewById(R.id.tvDate);
            rbAvgRating = itemView.findViewById(R.id.rbAvgRating);
            tvUpvote = itemView.findViewById(R.id.tvUpvote);
        }

        public void bind(Reviews review) {
            int rating;
            rating = review.getTaste() + review.getTime() + review.getValue();
            rating = rating/3;
            tvReviewBody.setText(review.getReview());
            tvUser.setText(review.getUser().getUsername());
            tvDate.setText(review.getDate());
            rbAvgRating.setRating(rating);
            tvUpvote.setText("Upvotes: " + review.getUpvote());
            ParseFile image = review.getImage();
            if (image != null)
            {
                Glide.with(context).load(image.getUrl()).into(ivFoodImage);
            }
        }
    }
}