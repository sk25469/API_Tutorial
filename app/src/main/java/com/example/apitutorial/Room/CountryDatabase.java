package com.example.apitutorial.Room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Data.class}, version = 1)
public abstract class CountryDatabase extends RoomDatabase {
    public abstract DatabaseDao databaseDao();

}