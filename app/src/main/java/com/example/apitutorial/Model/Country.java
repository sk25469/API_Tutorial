package com.example.apitutorial.Model;

import java.util.ArrayList;

public class Country {
    String countryName, capitalName, region, subregion, population, borders, languages, flag;

    public Country(String countryName, String capitalName, String region, String subregion, String population,
                                String languages, String borders, String flag){
        this.borders = borders;
        this.capitalName = capitalName;
        this.countryName = countryName;
        this.population = population;
        this.region = region;
        this.subregion = subregion;
        this.languages = languages;
        this.flag =flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public void setBorders(String borders) {
        this.borders = borders;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public String getBorders() {
        return borders;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getLanguages() {
        return languages;
    }

    public String getPopulation() {
        return population;
    }

    public String getRegion() {
        return region;
    }

    public String getSubregion() {
        return subregion;
    }

    public String getFlag() {
        return flag;
    }
}
