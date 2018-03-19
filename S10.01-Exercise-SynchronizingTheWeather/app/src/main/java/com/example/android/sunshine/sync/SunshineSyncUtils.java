package com.example.android.sunshine.sync;

import android.content.Context;
import android.content.Intent;

// DONE (9) Create a class called SunshineSyncUtils
public class SunshineSyncUtils{
    public static void startImmediateSync(Context context){
        Intent startSunshineServiceIntent = new Intent(context,SunshineSyncIntentService.class);
        context.startService(startSunshineServiceIntent);
    }
}
    //  DONE (10) Create a public static void method called startImmediateSync
    //  DONE (11) Within that method, start the SunshineSyncIntentService