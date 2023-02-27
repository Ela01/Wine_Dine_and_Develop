package com.ewbugs.winedinedevelop;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainCoursesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_courses);//make sure to add to 'AndroidManifest.xml'
        //intents- a way of moving to a new activity
        //list view - you need a reference for that
        //arrays - collection of variables such as Strings, int's etc.
        //array adapters - convert an array of things into views onto the screen

        //reference to ListView
        ListView mainCoursesList = findViewById(R.id.list_view_main_courses);

        //make an array of dishes
        Dish[] mainCourses = {
                new Dish("Filet Mignon", "6oz filet with your choice of steak fries or a house salad", 32),
                new Dish("Beet Salad", "Fresh Spinach with shredded beets, goat cheese and toasted walnuts", 32),
                new Dish("Thai basil and mulberry salad", "A crisp salad featuring fresh thai basil and mulberry", 1499),
                new Dish("Onion and apple ciabatta", "Warm ciabatta filled with caramalised onion and fresh apple", 1299),
                new Dish("Onion and olive bread", "Crunchy bread made with baby onion and olive", 1199),
                new Dish("Onion and mustard soup", "Dried onion and French mustard combined into smooth soup", 1299),
                new Dish("Samphire and rocket salad", "Samphire and fresh rocket served on a bed of lettuce", 1599),
                new Dish("Cocoa and chicory salad", "Cocoa and chicory served on a bed of lettuce", 1699),
                new Dish("Cauliflower and squash curry", "Mild curry made with fresh cauliflower and butternut squash", 1499),
                new Dish("Cauliflower and potato madras", "Medium-hot madras made with fresh cauliflower and new potato", 1399)
        };

        //make an array adapter
        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mainCourses);

        //set your adapter on your Listview
        mainCoursesList.setAdapter(dishesAdapter);


    }
}
