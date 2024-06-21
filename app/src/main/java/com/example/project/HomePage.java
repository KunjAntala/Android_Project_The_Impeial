package com.example.project;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class HomePage extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton);
        TextView textView = (TextView) findViewById(R.id.textView);
        Button button = (Button) findViewById(R.id.button);
        Button button1 = (Button) findViewById(R.id.button2);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(HomePage.this, v);
                popup.setOnMenuItemClickListener(HomePage.this);
                popup.inflate(R.menu.menu);
                popup.show();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),RatingPage.class);
                startActivity(i);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),FeedbackPage.class);
                startActivity(i);
            }
        });
    }


    @Override
    public boolean onMenuItemClick(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.soup) {
            Toast.makeText(this, "Selected Item: SOUP ", Toast.LENGTH_SHORT).show();
            Intent i=new Intent(getApplicationContext(),SoupM.class);
            startActivity(i);
            return true;
        }
        else if (id == R.id.starter) {
            Toast.makeText(this, "Selected Item: STARTERS ", Toast.LENGTH_SHORT).show();
            Intent i=new Intent(getApplicationContext(),StarterM.class);
            startActivity(i);
            return true;
        }
        else if (id == R.id.world_cuisine) {
            Toast.makeText(this, "Selected Item: WORLD CUISINE", Toast.LENGTH_SHORT).show();
            Intent i=new Intent(getApplicationContext(),WorldCuisineM.class);
            startActivity(i);
            return true;
        }
        else if (id == R.id.sizzler) {
            Toast.makeText(this, "Selected Item: SIZZLER", Toast.LENGTH_SHORT).show();
            Intent i=new Intent(getApplicationContext(),SizzlerM.class);
            startActivity(i);
            return true;
        }
        else if (id == R.id.main_course) {
            Toast.makeText(this, "Selected Item: MAIN COURSE", Toast.LENGTH_SHORT).show();
            Intent i=new Intent(getApplicationContext(),MainCourseM.class);
            startActivity(i);
            return true;
        }
        else if (id == R.id.dal) {
            Toast.makeText(this, "Selected Item: DAL/RICE/BIRYANI", Toast.LENGTH_SHORT).show();
            Intent i=new Intent(getApplicationContext(),DalRiceBiryaniM.class);
            startActivity(i);
            return true;
        }
        else if (id == R.id.roti) {
            Toast.makeText(this, "Selected Item: ROTI/NAAN/PARATHA", Toast.LENGTH_SHORT).show();
            Intent i=new Intent(getApplicationContext(),RotiNaanParathaM.class);
            startActivity(i);
            return true;
        }
        else if (id == R.id.dessert) {
            Toast.makeText(this, "Selected Item: DESSERTS", Toast.LENGTH_SHORT).show();
            Intent i=new Intent(getApplicationContext(),DessertM.class);
            startActivity(i);
            return true;
        }
        else if (id == R.id.accompaniments) {
            Toast.makeText(this, "Selected Item: ACCOMPANIMENTS", Toast.LENGTH_SHORT).show();
            Intent i=new Intent(getApplicationContext(),AccompanimentsM.class);
            startActivity(i);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}





