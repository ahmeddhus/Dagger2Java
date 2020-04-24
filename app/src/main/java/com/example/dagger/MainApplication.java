package com.example.dagger;

import android.app.Application;

public class MainApplication extends Application {

    private CoffeeComponent coffeeComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        coffeeComponent = DaggerCoffeeComponent.builder().sugar(2).milk(5).build();
    }

    public CoffeeComponent getCoffeeComponent() {
        return coffeeComponent;
    }
}
