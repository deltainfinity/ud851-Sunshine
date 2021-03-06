/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.sunshine.data;

import android.provider.BaseColumns;

import org.xml.sax.DTDHandler;

/**
 * Defines table and column names for the weather database. This class is not necessary, but keeps
 * the code organized.
 */
public class WeatherContract {

//  DONE (1) Within WeatherContract, create a public static final class called WeatherEntry that implements BaseColumns
    public static final class WeatherEntry implements BaseColumns{
        public static final String TABLE_NAME = "weather";
        public static final String COLUMN_DATE = "date";
        public static final String COLUMN_WEATHER_ID = "weather_id";
        public static final String COLUMN_MIN_TEMP = "min";
        public static final String COLUMN_MAX_TEMP = "max";
        public static final String COLUMN_HUMIDITY = "humidity";
        public static final String COLUMN_PRESSURE = "pressure";
        public static final String COLUMN_WIND_SPEED = "wind";
        public static final String COLUMN_DEGREES = "degrees";
}

//      Do steps 2 through 10 within the WeatherEntry class

//      DONE (2) Create a public static final String call TABLE_NAME with the value "weather"

//      DONE (3) Create a public static final String call COLUMN_DATE with the value "date"

//      DONE (4) Create a public static final String call COLUMN_WEATHER_ID with the value "weather_id"

//      DONE (5) Create a public static final String call COLUMN_MIN_TEMP with the value "min"
//      DONE (6) Create a public static final String call COLUMN_MAX_TEMP with the value "max"

//      DONE (7) Create a public static final String call COLUMN_HUMIDITY with the value "humidity"

//      DONE (8) Create a public static final String call COLUMN_PRESSURE with the value "pressure"

//      DONE (9) Create a public static final String call COLUMN_WIND_SPEED with the value "wind"

//      DONE (10) Create a public static final String call COLUMN_DEGREES with the value "degrees"
}