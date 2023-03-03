package com.ewbugs.winedinedevelop;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class DessertsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desserts);//make sure to add to 'AndroidManifest.xml'
        //intents- (implicit) a way of moving to a new activity
        //list view - you need a reference for that
        //arrays - collection of variables such as Strings, int's etc.
        //array adapters - convert an array of things into views onto the screen

        //reference to ListView
        ListView dessertsList = findViewById(R.id.list_view_desserts);

        //make an array of dishes
        Dish[] desserts = {
                new Dish("Cocoa Puffs", "Cereal with your choice of milk", 32),
                new Dish("Cookies", "Your choice of chocolate chip, cranberry-walnut, lemon or birthday-batter", 32),
                new Dish("Pumpkin Pie", "Non-Dairy option available", 1499),
                new Dish("Apple crumb-cake", "Served with icecream (+ $3)", 1299),
                new Dish("Oreo Sundae", "Your choice of 3 ice cream flavors, whipped cream, Oreos, and chocolate fudge", 1199),
                new Dish("Milkshake", "Choice of ice cream: vanilla, cookies n' cream, strawberry, pistachio, chocolate, mint chip", 1299),
                new Dish("Rice Pudding", "Non-dairy/Kosher option available", 1599),
                new Dish("Popsicle Stick", "Seasonal", 1699),
                new Dish("Cheesecake", "Marble, raspberry, brownie, or Lemon", 1499),
                new Dish("Donuts", "Plain-glazed, blueberry-glazed, chocolate fudge, or raspberry filling", 1399)
        };

        //make an array adapter
        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, desserts);

        //set your adapter on your Listview
        dessertsList.setAdapter(dishesAdapter);


    }
}
