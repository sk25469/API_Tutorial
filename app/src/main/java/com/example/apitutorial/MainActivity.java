package com.example.apitutorial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.apitutorial.Model.Country;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView.Adapter mCountryListAdapter;

    ArrayList<Country> countryList;

    Country country1 = new Country("India", "New Delhi", "Asia", "Southern Asia", "120 Crores"
            , "Hindi, English", "PAK, CHINA", "Indian");

    Country country2 = new Country("Sri Lanka", "Kathmandu", "Asia", "Southern Asia", "50 Crores"
            , "Hindi, English, Tamil", "INDIA", "Sri Lankan");

    Country country3 = new Country("Bangladesh", "I dont know", "Asia", "Southern Asia", "60 Crores"
            , "Hindi, English, Bengali", "Myanmar", "Bangla");

    Country country4 = new Country("Pakistan", "Islamabad", "Asia", "Southern Asia", "55 Crores"
            , "Hindi, English, Urdu", "INDIA", "Pak");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeRecyclerView();
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