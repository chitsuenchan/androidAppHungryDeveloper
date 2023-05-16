package com.example.thehungerdeveloper;

import androidx.annotation.NonNull;

public class Dish {

    String title;
    String description;
    int price;

    Dish(String title, String description, int price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }

    @NonNull
    @Override // We want to customize this method not the default behaviour so this is why we have Override
    public String toString() {
        return title;
    }
}
