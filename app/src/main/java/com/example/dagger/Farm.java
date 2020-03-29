package com.example.dagger;

import android.util.Log;

import javax.inject.Inject;

public class Farm {

    @Inject
    public Farm() {
        Log.d("TAG ahmed", "Farm");
    }

    public String getBeans() {
        return "beans";
    }
}
