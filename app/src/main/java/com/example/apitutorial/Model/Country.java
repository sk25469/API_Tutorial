package com.example.apitutorial.Model;

public class Country {
    private String countryName, capitalName, region, subregion, population, borders, languages;
    private String flagUrl;

    public Country(String countryName, String capitalName, String region, String subregion, String population,
                                String languages, String borders, String flagUrl){
        this.borders = borders;
        this.capitalName = capitalName;
        this.countryName = countryName;
        this.population = population;
        this.region = region;
        this.subregion = subregion;
        this.languages = languages;
        this.flagUrl =flagUrl;
    }

    public void setFlagUrl(String flagUrl) {
        this.flagUrl = flagUrl;
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

    public String getFlagUrl() {
        return flagUrl;
    }
}
