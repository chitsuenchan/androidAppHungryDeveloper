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

        Dish dishOne = new Dish();

        dishOne.title = "Grilled Salmon with Lemon Butter Sauce";
        dishOne.description = "Great salmon food with extra love";
        dishOne.price = 9;


        String[] dishes = {
                "Grilled Salmon with Lemon Butter Sauce",
                "Chicken Parmesan with Spaghetti",
                "Beef Tenderloin Medallions with Red Wine Reduction",
                "Shrimp Scampi Pasta",
                "Vegetable Stir-Fry with Tofu",
                "Lobster Ravioli in Creamy Tomato Sauce",
                "BBQ Pulled Pork Sandwich with Coleslaw",
                "Margherita Pizza with Fresh Basil",
                "Chicken Tikka Masala with Basmati Rice",
                "Eggplant Parmesan with Marinara Sauce",
                "Beef Bulgogi with Steamed Rice",
                "Seafood Paella with Saffron Rice",
                "Spinach and Ricotta Stuffed Chicken Breast",
                "Veggie Pad Thai with Peanut Sauce",
                "Lamb Kebabs with Mint Yogurt Sauce",
                "Mushroom Risotto with Truffle Oil",
                "Teriyaki Glazed Salmon with Jasmine Rice",
                "Chicken and Waffles with Maple Syrup",
                "Spaghetti Carbonara with Pancetta and Parmesan",
                "Sushi Platter with a Variety of Rolls and Sashimi"
        };

        ArrayAdapter<String> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);

        startersList.setAdapter(dishesAdapter);


    }
}