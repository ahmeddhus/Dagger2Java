package com.example.dagger;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class Coffee {

    @Inject
    Farm farm;

    River river;
    int sugar;
    int milk;

    @Inject
    public Coffee(River river, @Sugar int sugar, @Milk int milk) {
        this.river = river;
        this.sugar = sugar;
        this.milk = milk;
    }

    @Inject
    public void connectElectricity() {
        Log.d("TAG ahmed", "Connecting");
    }

    public String getCoffeeCup() {
        return farm.getBeans() + "+" + river.getWater() + " sugar: " + sugar + " milk: " + milk;
    }
}