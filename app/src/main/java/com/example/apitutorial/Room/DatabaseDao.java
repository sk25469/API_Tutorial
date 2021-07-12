package com.example.apitutorial.Room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.apitutorial.Model.Country;

import java.util.List;

@Dao
public interface DatabaseDao {

    @Query("SELECT * FROM data WHERE country_name = :name")
    Data getCountry(String name);

    @Insert
    void insertCountry(Data data);

    @Query("DELETE FROM data")
    void nukeTable();


}
