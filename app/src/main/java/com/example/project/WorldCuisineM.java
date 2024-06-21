package com.example.project;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class WorldCuisineM extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.world_cuisine);

        ImageView imageView1=(ImageView) findViewById(R.id.imageView1);
        ImageView imageView2=(ImageView) findViewById(R.id.imageView2);

        TextView textView1=(TextView) findViewById(R.id.textView1);
        TextView textView2=(TextView) findViewById(R.id.textView2);
        TextView textView3=(TextView) findViewById(R.id.textView3);
        TextView textView4=(TextView) findViewById(R.id.textView4);
        TextView textView5=(TextView) findViewById(R.id.textView5);
        TextView textView6=(TextView) findViewById(R.id.textView6);

        Button button1=(Button) findViewById(R.id.button1);
        Button button2=(Button) findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)  {
                Toast.makeText(getBaseContext(), "item Added to Cart" , Toast.LENGTH_SHORT ).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)  {
                Toast.makeText(getBaseContext(), "item Added to Cart" , Toast.LENGTH_SHORT ).show();
            }
        });
    }
}
