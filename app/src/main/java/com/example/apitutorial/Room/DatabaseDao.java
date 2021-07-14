package com.example.apitutorial.Room;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.apitutorial.Model.Country;

@Dao
public interface DatabaseDao {

    @Insert
    void insertCountry(Country country);

    @Query("SELECT * FROM country WHERE country_name = :name")
    LiveData<Country> getCountry(String name);

    @Query("DELETE FROM country")
    void nukeTable();


}
