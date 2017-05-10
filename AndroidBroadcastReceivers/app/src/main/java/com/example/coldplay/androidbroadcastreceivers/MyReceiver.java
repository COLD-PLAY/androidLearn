package com.example.coldplay.androidbroadcastreceivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by COLDPLAY on 2017/5/8.
 */

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "check the intent, ", Toast.LENGTH_LONG).show();
        Toast.makeText(context, "I love you", Toast.LENGTH_SHORT).show();
    }
}
