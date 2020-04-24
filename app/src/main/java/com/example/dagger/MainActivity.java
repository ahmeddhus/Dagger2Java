package com.example.dagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Coffee coffee, coffee2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CoffeeComponent component = ((MainApplication)getApplication()).getCoffeeComponent();
        component.inject(this);

        Log.d("TAG ahmed", coffee.getCoffeeCup()+"\n Farm for Coffe1:"+coffee.farm+
                "\n Farm for Coffee2: "+coffee2.farm);
    }
}