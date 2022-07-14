package com.jsyiyi.javacode.BroadcastReceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class WcyBroadcastReceiver extends BroadcastReceiver {
    private static final String TAG = "WcyBroadcastReceiver";
    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
    }
}
