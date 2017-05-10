package com.example.coldplay.helloandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String msg = "Android: ";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg, "The onCreate() event");
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }

    // Method to start the service
    public void startService(View view) {
        startService(new Intent(getBaseContext(), MyService.class));
    }

    // Method to stop the service
    public void stopService(View view) {
        stopService(new Intent(getBaseContext(), MyService.class));
    }

//    @Override
//    protected void onStart() {
//        super.onStart();
//        Log.d(msg, "The onStart() event");
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Log.d(msg, "The onPause() event");
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Log.d(msg, "The onStop() event");
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Log.d(msg, "The onDestroy() event");
//    }

}
