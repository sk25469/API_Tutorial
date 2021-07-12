package com.example.apitutorial.Room;

import androidx.room.Dao;
import androidx.room.Query;

import com.example.apitutorial.Model.Country;

import java.util.List;

@Dao
public interface DatabaseDao {

    @Query("SELECT * FROM country")
    List<Country> getAll();


}
