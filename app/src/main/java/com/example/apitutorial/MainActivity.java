package com.example.apitutorial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;

import com.example.apitutorial.Model.Country;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private RecyclerView.Adapter mCountryListAdapter;

    ArrayList<Country> countryList;

    Country country1 = new Country("India", "New Delhi", "Asia", "Southern Asia", "120 Crores"
            , "Hindi, English", "PAK, CHINA", "https://restcountries.eu/data/ind.svg");

    Country country2 = new Country("Sri Lanka", "Kathmandu", "Asia", "Southern Asia", "50 Crores"
            , "Hindi, English, Tamil", "INDIA", "https://restcountries.eu/data/lka.svg");

    Country country3 = new Country("Bangladesh", "I dont know", "Asia", "Southern Asia", "60 Crores"
            , "Hindi, English, Bengali", "Myanmar", "https://restcountries.eu/data/bgd.svg");

    Country country4 = new Country("Pakistan", "Islamabad", "Asia", "Southern Asia", "55 Crores"
            , "Hindi, English, Urdu", "INDIA", "https://restcountries.eu/data/pak.svg");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(isNetworkAvailable())    {
            Log.d(TAG, "Network is available");
        }
        else
            Log.d(TAG, "Network is unavailable");

        initializeRecyclerView();
    }

    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    private void initializeRecyclerView() {
        countryList = new ArrayList<>();

        countryList.add(country1);
        countryList.add(country2);
        countryList.add(country3);
        countryList.add(country4);

        RecyclerView mCountryList = findViewById(R.id.recycler_view);

        mCountryList.setNestedScrollingEnabled(false); /* to make a seamless scrolling **/

        mCountryList.setHasFixedSize(false);

        RecyclerView.LayoutManager mCountryListLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);

        mCountryList.setLayoutManager(mCountryListLayoutManager);

        mCountryListAdapter = new CountryListAdapter(countryList);

        mCountryList.setAdapter(mCountryListAdapter);
    }
}