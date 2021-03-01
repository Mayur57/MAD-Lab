package com.application.lab1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
        Intent getIntent = getIntent();

        String resultant = "placeholder";
        resultant = getIntent.getStringExtra("result");
        resultTextView.setText(resultant);
    }
}