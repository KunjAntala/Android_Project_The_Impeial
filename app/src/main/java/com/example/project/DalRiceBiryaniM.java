package com.example.project;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DalRiceBiryaniM extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dal_rice_biryani);

        ImageView imageView1=(ImageView) findViewById(R.id.imageView1);
        ImageView imageView2=(ImageView) findViewById(R.id.imageView2);
        ImageView imageView3=(ImageView) findViewById(R.id.imageView3);
        ImageView imageView4=(ImageView) findViewById(R.id.imageView4);
        ImageView imageView5=(ImageView) findViewById(R.id.imageView5);

        TextView textView1=(TextView) findViewById(R.id.textView1);
        TextView textView2=(TextView) findViewById(R.id.textView2);
        TextView textView3=(TextView) findViewById(R.id.textView3);
        TextView textView4=(TextView) findViewById(R.id.textView4);
        TextView textView5=(TextView) findViewById(R.id.textView5);
        TextView textView6=(TextView) findViewById(R.id.textView6);
        TextView textView7=(TextView) findViewById(R.id.textView7);
        TextView textView8=(TextView) findViewById(R.id.textView8);
        TextView textView9=(TextView) findViewById(R.id.textView9);
        TextView textView10=(TextView) findViewById(R.id.textView10);

        Button button1=(Button) findViewById(R.id.button1);
        Button button2=(Button) findViewById(R.id.button2);
        Button button3=(Button) findViewById(R.id.button3);
        Button button4=(Button) findViewById(R.id.button4);
        Button button5=(Button) findViewById(R.id.button5);

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

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)  {
                Toast.makeText(getBaseContext(), "item Added to Cart" , Toast.LENGTH_SHORT ).show();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)  {
                Toast.makeText(getBaseContext(), "item Added to Cart" , Toast.LENGTH_SHORT ).show();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)  {
                Toast.makeText(getBaseContext(), "item Added to Cart" , Toast.LENGTH_SHORT ).show();
            }
        });
    }
}

