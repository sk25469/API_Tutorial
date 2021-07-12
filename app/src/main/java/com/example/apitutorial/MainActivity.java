package com.example.apitutorial;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.apitutorial.Model.Country;
import com.example.apitutorial.RequestAPI.Result;
import com.example.apitutorial.RequestAPI.RetrofitClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private RecyclerView.Adapter mCountryListAdapter;

    ArrayList<Country> countryList;

//    Country country1 = new Country("India", "New Delhi", "Asia", "Southern Asia", "120 Crores"
//            , "Hindi, English", "PAK, CHINA", "https://restcountries.eu/data/ind.svg");
//
//    Country country2 = new Country("Sri Lanka", "Kathmandu", "Asia", "Southern Asia", "50 Crores"
//            , "Hindi, English, Tamil", "INDIA", "https://restcountries.eu/data/lka.svg");
//
//    Country country3 = new Country("Bangladesh", "I dont know", "Asia", "Southern Asia", "60 Crores"
//            , "Hindi, English, Bengali", "Myanmar", "https://restcountries.eu/data/bgd.svg");
//
//    Country country4 = new Country("Pakistan", "Islamabad", "Asia", "Southern Asia", "55 Crores"
//            , "Hindi, English, Urdu", "INDIA", "https://restcountries.eu/data/pak.svg");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (isNetworkAvailable()) {
            Log.d(TAG, "Network is available");
        } else
            Log.d(TAG, "Network is unavailable");

        initializeRecyclerView();
        getCountryDetails();
    }

    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    private void getCountryDetails() {
        Log.d(TAG, "Starting getCountryDetails");

        Call<List<Result>> call = RetrofitClient.getInstance().getMyApi().getCountryDetails();
        call.enqueue(new Callback<List<Result>>() {

            @Override
            public void onResponse(@NonNull Call<List<Result>> call, @NonNull Response<List<Result>> response) {
                List<Result> countryDetail = response.body();
                assert countryDetail != null;
                Log.d(TAG, String.valueOf(countryDetail.size())) ;

                for (Result res : countryDetail) {

                    ArrayList<Result.LangObject> lang = new ArrayList<>(res.getLanguages());

                    StringBuilder languages = new StringBuilder();
                    for (int j = 0; j < lang.size(); j++) {
                        Log.d(TAG, "Value of lang is " + lang.get(j).getLang());
                        languages.append(lang.get(j).getLang()).append(", ");
                    }

                    ArrayList<String> borders = new ArrayList<>(res.getBorders());

                    StringBuilder bord = new StringBuilder();
                    for (int j = 0; j < borders.size(); j++) {
                        bord.append(borders.get(j)).append(", ");
                    }
                    Country country = new Country( res.getCountryName(),
                            res.getCountryCapital(), res.getRegion(), res.getSubregion(),
                            res.getPopulation(), languages.toString(), bord.toString(), res.getFlagUrl());

                    countryList.add(country);
                }


            }

            @Override
            public void onFailure(@NonNull Call<List<Result>> call, @NonNull Throwable t) {
                Toast.makeText(getApplicationContext(), "An error has occured", Toast.LENGTH_LONG).show();
                Log.d(TAG, t.getMessage());
            }

        });
    }

    private void initializeRecyclerView() {

        countryList = new ArrayList<>();

        RecyclerView mCountryList = findViewById(R.id.recycler_view);

        mCountryList.setNestedScrollingEnabled(false); /* to make a seamless scrolling **/

        mCountryList.setHasFixedSize(false);

        RecyclerView.LayoutManager mCountryListLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);

        mCountryList.setLayoutManager(mCountryListLayoutManager);

        mCountryListAdapter = new CountryListAdapter(countryList);

        mCountryList.setAdapter(mCountryListAdapter);
    }
}