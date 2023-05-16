package com.example.thehungerdeveloper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StartersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);

        ListView startersList = findViewById(R.id.list_view_starters);

        Dish[] dishes = {
                new Dish("Grilled Salmon with Lemon Butter Sauce", "Great salmon food with extra love", 9),
                new Dish("Chicken Parmesan with Spaghetti", "Chicken made with even more love", 5),
                new Dish("Caprese Salad", "Fresh mozzarella, tomatoes, and basil drizzled with balsamic glaze", 6),
                new Dish("Crispy Calamari with Marinara Sauce", "Golden fried calamari served with tangy marinara sauce", 8),
                new Dish("Garlic Parmesan Wings", "Crispy chicken wings tossed in a garlic parmesan sauce", 7),
                new Dish("Spinach and Artichoke Dip", "Creamy dip with spinach, artichokes, and melted cheese", 6),
                new Dish("Bruschetta with Tomato and Basil", "Toasted bread topped with fresh tomatoes, basil, and garlic", 5),
                new Dish("Stuffed Mushrooms", "Mushroom caps filled with a savory mixture of breadcrumbs and cheese", 7),
                new Dish("Shrimp Cocktail", "Chilled shrimp served with a zesty cocktail sauce", 9),
                new Dish("Cheese and Charcuterie Board", "Assortment of cheeses, cured meats, and accompaniments", 12)
        };

        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);

        startersList.setAdapter(dishesAdapter);


    }
}