package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.project.LoginPage;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    TextView textView1;
    TextView textView2;
    Button btn;
    Button b2;
    Spinner spinner;
    ImageView imageView;

    public static final String[] languages = {"Select Language","English","Gujrati","Hindi"};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1=findViewById(R.id.textView1);
        textView2=findViewById(R.id.textView2);
        btn=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        imageView=findViewById(R.id.imageView);
        spinner=findViewById(R.id.spinner);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, languages);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setSelection(0);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedLang = adapterView.getItemAtPosition(i).toString();
                if (selectedLang.equals("English")){
                    setLocal(MainActivity.this,"en");
                    finish();
                    startActivity(getIntent());
                } else if (selectedLang.equals("Gujrati")) {
                    setLocal(MainActivity.this,"gu");
                    finish();
                    startActivity(getIntent());
                } else if (selectedLang.equals("Hindi")) {
                    setLocal(MainActivity.this,"hi");
                    finish();
                    startActivity(getIntent());
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, LoginPage.class);
                startActivity(i);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, SignUpPage.class);
                startActivity(i);
            }
        });
    }
    public void setLocal(Activity activity, String langCode){
        Locale locale = new Locale(langCode);
        locale.setDefault(locale);
        Resources resources = activity.getResources();
        Configuration config = resources.getConfiguration();
        config.setLocale(locale);
        resources.updateConfiguration(config, resources.getDisplayMetrics());
    }
}