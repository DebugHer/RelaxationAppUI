package com.example.aadegoke.layouttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.airbnb.lottie.LottieAnimationView;

public class Main2Activity extends AppCompatActivity {
    Button relax;
    LottieAnimationView world;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        relax = findViewById(R.id.relax);
        world = findViewById(R.id.world);
        world.setAnimation("animation/world_locations.json");
        world.playAnimation();
        relax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main2Activity.this, MainActivity.class));
            }
        });

    }
}
