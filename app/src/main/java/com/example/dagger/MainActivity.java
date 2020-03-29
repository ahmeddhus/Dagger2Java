package com.example.dagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Coffee coffee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CoffeeComponent component = DaggerCoffeeComponent.builder().sugar(2).milk(5).build();
        component.inject(this);
        Log.d("TAG ahmed", coffee.getCoffeeCup());
    }
}