package com.example.apitutorial.Room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface DatabaseDao {

    @Query("SELECT * FROM data WHERE country_name = :name")
    Data getCountry(String name);

    @Insert
    void insertCountry(Data data);

    @Query("DELETE FROM data")
    void nukeTable();


}
