package com.example.apitutorial.Room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.apitutorial.Model.Country;

@Database(entities = {Country.class}, version = 1)
public abstract class CountryDatabase extends RoomDatabase {
    public abstract DatabaseDao databaseDao();

}