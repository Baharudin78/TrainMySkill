package com.example.trainmyskill;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class SplashAct extends AppCompatActivity {

    ImageView logo_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        logo_main = findViewById(R.id.logo_main);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent go_next = new Intent(SplashAct.this,MainActivity.class
                );
            }
        },1000);
    }
}
