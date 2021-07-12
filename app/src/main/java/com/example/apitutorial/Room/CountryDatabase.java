package com.example.apitutorial.Room;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.apitutorial.Model.Country;

@Database(entities = {Data.class}, version = 1)
public abstract class CountryDatabase extends RoomDatabase {
    public abstract DatabaseDao databaseDao();

}