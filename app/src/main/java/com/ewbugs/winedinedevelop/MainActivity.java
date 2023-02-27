package com.ewbugs.winedinedevelop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    //CardView variables could have all been local.
    CardView startersCard;
    CardView mainsCard;
    CardView dessertsCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startersCard = findViewById(R.id.card_view_starters);
        mainsCard = findViewById(R.id.card_view_mains);
        dessertsCard = findViewById(R.id.card_view_desserts);

        startersCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startersActivityIntent = new Intent(MainActivity.this, StartersActivity.class);

                startActivity(startersActivityIntent);
            }
        });

        mainsCard.setOnClickListener(v -> {
            Intent mainCoursesActivityIntent = new Intent(MainActivity.this, MainCoursesActivity.class);
            startActivity(mainCoursesActivityIntent);

        });

        dessertsCard.setOnClickListener(v -> {

            Intent dessertsActivityIntent = new Intent(MainActivity.this, DessertsActivity.class);

            startActivity(dessertsActivityIntent);
        });

        // Android common intents -> implicit intent
        TextView emailTextView = findViewById(R.id.text_view_email_address);
        emailTextView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent launchEmailAppIntent = new Intent(Intent.ACTION_SENDTO);
                //copied from 'android common intents" site
                launchEmailAppIntent.setData(Uri.parse("mailto:elizabeth01wieczorek@gmail.com"));
                startActivity(launchEmailAppIntent);

            }

        });
    }
}