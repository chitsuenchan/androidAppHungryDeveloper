package com.example.thehungerdeveloper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CardView startersCard;
    CardView mainsCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startersCard = findViewById(R.id.card_view_starters);
        mainsCard = findViewById(R.id.card_view_mains);


        startersCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent starterActivityIntent = new Intent(MainActivity.this, StartersActivity.class);

                startActivity(starterActivityIntent);
            }
        });

        mainsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent mainCoursesActivityIntent = new Intent(MainActivity.this, MainCoursesActivity.class);

                startActivity(mainCoursesActivityIntent);
            }
        });

        mainsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent mainCoursesActivityIntent = new Intent(MainActivity.this, MainCoursesActivity.class);

                startActivity(mainCoursesActivityIntent);
            }
        });

        // This is implicit intent
        TextView emailTextView = findViewById(R.id.text_view_email_address); // We made a reference to our new Textview layout
        emailTextView.setOnClickListener(new View.OnClickListener() { // We set an setonClickListener on that
            @Override
            public void onClick(View v) {
                Intent launchEmailAppIntent = new Intent(Intent.ACTION_SENDTO); // This time we give an action to do (implicit intent)
                launchEmailAppIntent.setData(Uri.parse("mailto:chitsuenchan@gmail.com"));
                startActivity(launchEmailAppIntent);


            }
        });


    }
}