package com.example.apitutorial.RequestAPI;

import androidx.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Result {


    @SerializedName("name")
    @Expose
    private final String countryName;

    @SerializedName("capital")
    @Expose
    private final String countryCapital;

    @SerializedName("region")
    @Expose
    private final String region;

    @SerializedName("subregion")
    @Expose
    private final String subregion;

    @SerializedName("population")
    @Expose
    private final String population;

    @SerializedName("borders")
    @Expose
    private final ArrayList<String> borders;

    @SerializedName("languages")
    @Expose
    private final ArrayList<LangObject> languages;

    @SerializedName("flag")
    @Expose
    private final String flagUrl;

    public Result( String countryName, String countryCapital, String region, String subregion, String population,
                   ArrayList<String> borders, ArrayList<LangObject> languages,String flagUrl) {

        this.countryName = countryName;
        this.region = region;
        this.subregion = subregion;
        this.population = population;
        this.languages = languages;
        this.flagUrl = flagUrl;
        this.borders = borders;
        this.countryCapital = countryCapital;

    }

    public static class LangObject {

        String lang, faltu1, faltu2, faltu4;

        public LangObject(String faltu1, String faltu2, String lang, String faltu4){
            this.faltu1 = faltu1;
            this.faltu2 = faltu2;
            this.lang = lang;
            this.faltu4 = faltu4;
        }

        public String getLang() {
            return lang;
        }
    }

    public String getFlagUrl() {
        return flagUrl;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getSubregion() {
        return subregion;
    }

    public String getRegion() {
        return region;
    }

    public String getPopulation() {
        return population;
    }

    public ArrayList<String> getBorders() {
        return borders;
    }

    public ArrayList<LangObject> getLanguages() {
        return languages;
    }

    public String getCountryCapital() {
        return countryCapital;
    }

    @NonNull
    @Override
    public String toString() {
        return languages.toString();
    }
}
