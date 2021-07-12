package com.example.apitutorial.Room;

import android.content.Context;

import androidx.room.Room;

public class DatabaseClient {

    private Context mContext;
    private static DatabaseClient mInstance;


    private CountryDatabase countryDatabase;

    private DatabaseClient(Context mContext) {
        this.mContext = mContext;

        //creating the app database with Room database builder
        //MyToDos is the name of the database
        countryDatabase = Room.databaseBuilder(mContext, CountryDatabase.class, "CountryDetails").build();
    }

    public static synchronized DatabaseClient getInstance(Context mContext) {
        if (mInstance == null) {
            mInstance = new DatabaseClient(mContext);
        }
        return mInstance;
    }

    public CountryDatabase getAppDatabase() {
        return countryDatabase;
    }

}
