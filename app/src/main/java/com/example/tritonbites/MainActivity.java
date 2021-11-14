package com.example.tritonbites;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.app.Fragment;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.tritonbites.R;
import com.example.tritonbites.fragments.FoodDetailFragment;
import com.example.tritonbites.fragments.FoodReviewFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    final FragmentManager fragmentManager = getSupportFragmentManager();
    //private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* bottomNavigationView = findViewById(R.id.bottomNavigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment fragment;
                switch (menuItem.getItemId()) {
                    case R.id.action_home:
                        //fragment = new PostsFragment();
                        break;
                    case R.id.action_compose:
                        //fragment = new ComposeFragment();
                        break;
                    case R.id.action_profile:
                    default:
                        //fragment = new ProfileFragment();
                        break;

                fragmentManager.beginTransaction().replace(R.id.flContainer, fragment).commit();
                return true;
            }
        });*/
        //bottomNavigationView.setSelectedItemId(R.id.action_home);

        fragmentManager.beginTransaction().replace(R.id.flContainer, new FoodDetailFragment()).commit();
    }
}
