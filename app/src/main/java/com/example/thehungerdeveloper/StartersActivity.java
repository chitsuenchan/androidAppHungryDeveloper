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
                new Dish("Grilled Salmon with Lemon Butter Sauce", "Great salmon food with extra love", 9 ),
                new Dish("Chicken Parmesan with Spaghetti", "Chicken made with even more love", 5 ),
                new Dish("Beef Tenderloin with Red Wine Reduction", "Tender beef cooked to perfection", 12),
                new Dish("Vegetable Curry with Rice", "A flavorful blend of vegetables and spices", 8),
                new Dish("Shrimp Scampi with Linguine", "Juicy shrimp tossed in a garlic-infused butter sauce", 10),
                new Dish("Mushroom Risotto with Truffle Oil", "Creamy risotto with earthy mushroom flavors", 7),
                new Dish("BBQ Ribs with Coleslaw and Cornbread", "Fall-off-the-bone ribs with classic sides", 14),
                new Dish("Spinach and Feta Stuffed Chicken Breast", "Savory chicken breast filled with spinach and feta", 6),
                new Dish("Lemon Herb Roasted Chicken with Roasted Potatoes", "Tender chicken infused with zesty flavors", 9),
                new Dish("Pasta Primavera with Garlic Bread", "A medley of fresh vegetables served over pasta", 8)
        };

        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);

        startersList.setAdapter(dishesAdapter);


    }
}