package com.application.lab1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class urlLauncherActivity extends AppCompatActivity {

    EditText urlView;
    Button launch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_url_launcher);

        launch = findViewById(R.id.burl);
        urlView = findViewById(R.id.urlTextView);

        launch.setOnClickListener(v -> {
            Uri uri = Uri.parse(String.valueOf(urlView.getText()));
            Intent launchUrlIntent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(launchUrlIntent);
        });
    }
}