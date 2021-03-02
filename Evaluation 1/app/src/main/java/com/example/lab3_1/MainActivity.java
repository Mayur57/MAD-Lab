package com.example.lab3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //Equal -> Show toast "Guess is correct"
    //Unequal -> Show toast comparing the values (greater, lesser)

    Button button;
    EditText editText1;

    public static int getSeedValue(int[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        editText1 = findViewById(R.id.textView);

        button.setOnClickListener(v -> {
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            String guess = "";
            guess = guess + editText1.getText().toString();
            int rnd = new Random().nextInt(array.length);
            int seed = array[rnd];
            Log.w("tag", "Seed value is: " + seed);
                Log.w("tag", "Guess value is: " + guess);
            int enteredValue = Integer.parseInt(guess);
            if(seed == enteredValue){
                Toast.makeText(MainActivity.this, "Guess is correct",
                        Toast.LENGTH_LONG).show();
            }
            else {
                if(enteredValue > seed) {
                    Toast.makeText(MainActivity.this, "Guess is larger than the seed",
                            Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Guess is smaller than the seed",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}