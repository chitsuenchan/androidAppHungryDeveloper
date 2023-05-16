package com.example.thehungerdeveloper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DessertsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desserts);

        ListView dessertsList = findViewById(R.id.list_view_desserts);

        Dish[] dishes = {
                new Dish("Egg Tart", "Classic Hong Kong egg tart", 3),
                new Dish("Chocolate Lava Cake", "Warm chocolate cake with a gooey, molten center", 7),
                new Dish("New York Cheesecake", "Rich and creamy cheesecake with a graham cracker crust", 6),
                new Dish("Tiramisu", "Layered Italian dessert with coffee-soaked ladyfingers and mascarpone cream", 8),
                new Dish("Strawberry Shortcake", "Light and fluffy cake layered with fresh strawberries and whipped cream", 5),
                new Dish("Creme Brulee", "Smooth and creamy custard with a caramelized sugar crust", 7),
                new Dish("Banana Split", "A classic dessert with bananas, ice cream, whipped cream, and toppings", 9),
                new Dish("Apple Pie", "Homemade pie with a flaky crust and sweet apple filling", 6),
                new Dish("Molten Chocolate Souffle", "Decadent chocolate dessert with a gooey center", 8),
                new Dish("Panna Cotta", "Italian dessert made with sweetened cream and flavored with vanilla", 5)
        };

        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);

        dessertsList.setAdapter(dishesAdapter);

    }
}