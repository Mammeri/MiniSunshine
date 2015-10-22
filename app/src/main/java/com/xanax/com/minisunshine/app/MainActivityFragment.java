package com.xanax.com.minisunshine.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main,container);

        String[] forecastArray = {
                "Aujourd'hui - Ensoleillé - 24/16",
                "Demain - Pluvieux - 12/8",
                "Samedi - Ensoleillé - 24/16",
                "Dimanche - Nuageux - 24/16",
                "Lundi - Neige - 24/16",
                "Mardi - Ensoleillé - 24/16",
                "Mercredi - Ensoleillé - 24/16"
        };

        List<String> weekForecast = new ArrayList<String>(
                Arrays.asList(forecastArray)
        );

        ArrayAdapter<String> mForecastAdapter;
        mForecastAdapter = new ArrayAdapter<String>(getActivity(), R.layout.list_item_forecast_textview,R.id.list_item_forecast_textview2,weekForecast);

        ListView listView  = (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(mForecastAdapter);
        //return inflater.inflate(R.layout.fragment_main, container, false);
        return rootView;



    }
}
