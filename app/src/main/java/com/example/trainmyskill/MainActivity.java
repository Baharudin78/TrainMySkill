package com.example.trainmyskill;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView navigation;
    FrameLayout frameLayout;

    //fragment method
    private HomeView homeView;
    private ExploreView exploreView;
    private OrderView orderView;
    private InboxView inboxView;
    private ProfileView profileView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigation = findViewById(R.id.bottomNavigationView);
        frameLayout = findViewById(R.id.frameLayout);

        //fragment inisialisasi
        homeView = new HomeView();
        exploreView = new ExploreView();
        orderView = new OrderView();
        inboxView = new InboxView();
        profileView = new ProfileView();

        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                //switch untuk memilih item yang dipilih didalam case
                switch (menuItem.getItemId()){
                    case R.id.navigation_Home :
                        InitializeFragment(homeView);
                        return true;
                    case R.id.navigation_Explore:
                        InitializeFragment(exploreView);
                        return true;
                    case R.id.navigation_Order:
                        InitializeFragment(orderView);
                        return true;
                    case R.id.navigation_Inbox:
                        InitializeFragment(inboxView);
                        return true;
                    case R.id.navigation_Profile :
                        InitializeFragment(profileView);
                        return true;
                }
                return false;
            }
        });
    }

    private void InitializeFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout,fragment);
        fragmentTransaction.commit();

    }

}
