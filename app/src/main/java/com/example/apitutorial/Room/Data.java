package com.example.apitutorial.Room;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class Data implements Serializable {

    @PrimaryKey(autoGenerate = false)
    private String countryCode;

    @ColumnInfo(name = "country_name")
    private String countryName;

    @ColumnInfo(name = "capital_name")
    private String capitalName;

    @ColumnInfo(name = "region")
    private String region;

    @ColumnInfo(name = "subregion")
    private String subregion;

    @ColumnInfo(name = "population")
    private String population;

    @ColumnInfo(name = "border")
    private String countryBorder;

    @ColumnInfo(name = "languages")
    private String countryLang;

    @ColumnInfo(name = "flag")
    private String flagUrl;


    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public void setCountryBorder(String countryBorder) {
        this.countryBorder = countryBorder;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }


    public void setCountryLang(String countryLang) {
        this.countryLang = countryLang;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public void setFlagUrl(String flagUrl) {
        this.flagUrl = flagUrl;
    }

    public void setRegionName(String regionName) {
        this.region = regionName;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public String getCountryBorder() {
        return countryBorder;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getCountryLang() {
        return countryLang;
    }

    public String getPopulation() {
        return population;
    }

    public String getFlagUrl() {
        return flagUrl;
    }


    public String getRegionName() {
        return region;
    }

    public String getSubregion() {
        return subregion;
    }

}
