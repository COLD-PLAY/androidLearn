package com.example.coldplay.androidbroadcastreceivers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }

    // broadcast custom intent
    public void broadcastIntent(View view) {
        Intent intent = new Intent();
//        intent.setAction("com.example.coldplay.androidbroadcastreceivers.CUSTOM_INTENT");
        intent.setAction("android.intent.action.AIRPLANE_MODE");
        sendBroadcast(intent);
    }
}
