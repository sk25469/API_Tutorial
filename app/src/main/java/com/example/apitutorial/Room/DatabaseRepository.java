package com.example.apitutorial.Room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;

import androidx.room.Room;

public class DatabaseRepository {

    private final CountryDatabase countryDatabase;
    public DatabaseRepository(Context context) {
        String DB_NAME = "db_task";
        countryDatabase = Room.databaseBuilder(context, CountryDatabase.class, DB_NAME).build();
    }

    public void insertTask(String countryName, String capitalName, String region, String subregion, String population,
                           String language, String border, String flagUrl) {

        Data data = new Data();
        data.setCapitalName(capitalName);
        data.setCountryName(countryName);
        data.setRegionName(region);
        data.setSubregion(subregion);
        data.setPopulation(population);
        data.setCountryBorder(border);
        data.setCountryLang(language);
        data.setFlagUrl(flagUrl);
    }

    @SuppressLint("StaticFieldLeak")
    public void insertTask(final Data data) {
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {
                countryDatabase.databaseDao().insertCountry(data);
                return null;
            }
        }.execute();
    }

    public Data getTask(String id) {
        return countryDatabase.databaseDao().getCountry(id);
    }
}
