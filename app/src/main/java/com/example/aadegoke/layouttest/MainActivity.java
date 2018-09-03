package com.example.aadegoke.layouttest;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
    Button relax;
    LottieAnimationView world;
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottom);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.frag:
                        Toast.makeText(MainActivity.this, "Feature not available yet", Toast.LENGTH_SHORT).show();
                        Fragment fragment = new Fragment2();
                        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                        ft.replace(R.id.containerFrag, fragment);
                        ft.addToBackStack(null);
                        ft.commit();
                        break;
                    case R.id.home:
                        Fragment frag = new fragmenthome();
                         getSupportFragmentManager().beginTransaction().replace(R.id.containerFrag, frag).addToBackStack(null).commit();

                }

                return true;
            }
        });


    }


}
