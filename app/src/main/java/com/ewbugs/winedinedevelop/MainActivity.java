package com.ewbugs.winedinedevelop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
//Photo by <a href="https://unsplash.com/@walkator?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText">Walkator</a> on <a href="https://unsplash.com/photos/klMii3cR9iI?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText">Unsplash</a>
//Photo by Marc Mintel on Unsplash
    CardView startersCard;
    CardView mainsCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startersCard = findViewById(R.id.card_view_starters);
        mainsCard = findViewById(R.id.card_view_mains);
    }
}