package com.xanax.com.minisunshine.app;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/**
 * Created by aziz on 29/10/2015.
 */
public class WeatherDataParser {
    /**
     * Given a string of the form returned by the api call:
     * http://api.openweathermap.org/data/2.5/forecast/daily?q=94043&mode=json&units=metric&cnt=7
     * retrieve the maximum temperature for the day indicated by dayIndex
     * (Note: 0-indexed, so 0 would refer to the first day).
     */
    public static double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex)
            throws JSONException {
        JSONObject mainObject = new JSONObject(weatherJsonStr);
        JSONArray list = mainObject.getJSONArray("list");

        //for (int i = 0; i < list.length(); i++) {

            JSONObject a_day = list.getJSONObject(dayIndex);
            String dt = a_day.getString("dt");
          //  if (dt.equals(Integer.toString(dayIndex))) {
        JSONObject temp = a_day.getJSONObject("temp");
        Double maxtemp = Double.parseDouble(temp.getString("max"));
                return maxtemp;
          //  }
        //}
        //return -1;
    }
}
