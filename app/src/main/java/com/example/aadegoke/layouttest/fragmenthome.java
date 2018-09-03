package com.example.aadegoke.layouttest;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.airbnb.lottie.LottieAnimationView;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragmenthome extends Fragment {
    LottieAnimationView loading;
    ProgressBar p1,p2,p3;


    public fragmenthome() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v =  inflater.inflate(R.layout.fragment_fragmenthome, container, false);
        p1 = v.findViewById(R.id.progressBar);
        p2 = v.findViewById(R.id.progressBar2);
        p3 = v.findViewById(R.id.progressBar3);
        p1.setMax(100);
        p2.setMax(100);
        p3.setMax(100);
        loading = v.findViewById(R.id.loading);
        loading.setAnimation("animation/loading.json");
        loading.playAnimation();

        p1.setProgress(80);
        p2.setProgress(40);
        p3.setProgress(60);
        return v;
    }



}
