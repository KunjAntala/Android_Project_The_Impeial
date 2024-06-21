package com.example.project;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FeedbackPage extends AppCompatActivity {
    TextView textView;
    EditText editText;
    Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feedback);
        addListenerOnButtonClick();
    }
    public void addListenerOnButtonClick(){

        textView=findViewById(R.id.textView);
        editText=findViewById(R.id.editText);
        buttonSubmit=findViewById(R.id.buttonSubmit);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)  {
                Toast.makeText(getBaseContext(), "Feedback Received" , Toast.LENGTH_SHORT ).show();
            }
        });
    }
}