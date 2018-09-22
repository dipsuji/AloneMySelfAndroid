package com.activity.alonemyselfandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private Button nextButton;
    // Array of strings...
    String[] countryArray = {"India","Australia","America","Africa",
            "china","france","India","Australia","America","Africa",
            "china","france","India","Australia","America","Africa",
            "china","france","India","Australia","America","Africa",
            "china","france"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate....................");

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.row_item_list, countryArray);
        ListView listView = (ListView) findViewById(R.id.contry_list);
        listView.setAdapter(adapter);

        nextButton = findViewById(R.id.next_button);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // start new activity
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart....................");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume....................");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause....................");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop....................");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy....................");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart....................");
    }
}

