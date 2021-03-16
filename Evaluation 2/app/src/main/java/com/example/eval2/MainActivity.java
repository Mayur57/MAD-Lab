package com.example.eval2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] arr = {
            "Fruits","Vegetables","Junk"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.list_view, arr);

        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0){
                    Intent intent = new Intent(MainActivity.this, FruitActivity.class);
                    startActivity(intent);
                }
                if(i == 1){
                    Intent intent = new Intent(MainActivity.this, VegActivity.class);
                    startActivity(intent);
                }
                if(i == 2){
                    Intent intent = new Intent(MainActivity.this, JunkActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}