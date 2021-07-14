package com.example.apitutorial.Model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class Country implements Serializable {

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

    public Country(String countryName, String capitalName, String region, String subregion,
                   String population, String countryBorder, String countryLang, String flagUrl) {
        this.countryName = countryName;
        this.capitalName = capitalName;
        this.region = region;
        this.subregion = subregion;
        this.population = population;
        this.countryBorder = countryBorder;
        this.countryLang = countryLang;
        this.flagUrl = flagUrl;
    }

    public Country() {

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

    public void setRegion(String regionName) {
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


    public String getRegion() {
        return region;
    }

    public String getSubregion() {
        return subregion;
    }
}
