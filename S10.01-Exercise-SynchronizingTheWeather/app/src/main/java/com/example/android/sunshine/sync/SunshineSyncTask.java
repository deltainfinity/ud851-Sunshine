package com.example.android.sunshine.sync;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;

import com.example.android.sunshine.MainActivity;
import com.example.android.sunshine.data.SunshinePreferences;
import com.example.android.sunshine.data.WeatherContract;
import com.example.android.sunshine.utilities.NetworkUtils;
import com.example.android.sunshine.utilities.OpenWeatherJsonUtils;

import java.net.URL;

//  DONE (1) Create a class called SunshineSyncTask
public class SunshineSyncTask{
    synchronized public static void syncWeather(Context context){
        try {
            URL weatherRequestUrl = NetworkUtils.getUrl(context);
            String jsonWeatherResponse = NetworkUtils
                    .getResponseFromHttpUrl(weatherRequestUrl);

            ContentValues[] contentValues = OpenWeatherJsonUtils.getWeatherContentValuesFromJson(
                    context,
                    jsonWeatherResponse);
            if(null != contentValues && contentValues.length > 0) {
                ContentResolver sunshineResolver = context.getContentResolver();
                sunshineResolver.delete(WeatherContract.WeatherEntry.CONTENT_URI,
                        null,
                        null);
                sunshineResolver.bulkInsert(WeatherContract.WeatherEntry.CONTENT_URI,
                        contentValues);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
//  DONE (2) Within SunshineSyncTask, create a synchronized public static void method called syncWeather
//      DONE (3) Within syncWeather, fetch new weather data
//      DONE (4) If we have valid results, delete the old data and insert the new