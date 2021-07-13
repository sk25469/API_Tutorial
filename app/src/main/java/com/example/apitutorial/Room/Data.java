package com.example.apitutorial.Room;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class Data implements Serializable {

    @PrimaryKey(autoGenerate = true)
    private int countryId;

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

    public Data(String countryName, String capitalName, String region, String subregion, String population,
                String countryLang, String countryBorder, String flagUrl) {

        this.countryBorder = countryBorder;
        this.capitalName = capitalName;
        this.countryName = countryName;
        this.population = population;
        this.region = region;
        this.subregion = subregion;
        this.countryLang = countryLang;
        this.flagUrl = flagUrl;
    }

    public Data() {
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public void setCountryBorder(String countryBorder) {
        this.countryBorder = countryBorder;
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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
