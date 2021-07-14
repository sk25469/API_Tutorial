package com.example.apitutorial.Room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;
import androidx.room.Room;

import com.example.apitutorial.Model.Country;

public class DatabaseRepository {

    private final CountryDatabase countryDatabase;
    public DatabaseRepository(Context context) {
        String DB_NAME = "db_task";
        countryDatabase = Room.databaseBuilder(context, CountryDatabase.class, DB_NAME).build();
    }

    public void insertCountry(String countryName, String capitalName, String region, String subregion, String population,
                              String language, String border, String flagUrl) {

        Country country = new Country();
        country.setCapitalName(capitalName);
        country.setCountryName(countryName);
        country.setRegion(region);
        country.setSubregion(subregion);
        country.setPopulation(population);
        country.setCountryBorder(border);
        country.setCountryLang(language);
        country.setFlagUrl(flagUrl);

        insertCountry(country);
    }

    @SuppressLint("StaticFieldLeak")
    public void insertCountry(final Country country) {
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {
                countryDatabase.databaseDao().insertCountry(country);
                return null;
            }
        }.execute();
    }

    public LiveData<Country> getCountry(String id) {
        return countryDatabase.databaseDao().getCountry(id);
    }
}
