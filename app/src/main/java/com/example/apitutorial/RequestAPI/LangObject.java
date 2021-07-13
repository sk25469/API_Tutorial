package com.example.apitutorial.RequestAPI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LangObject {

    @SerializedName("name")
    @Expose
    private String lang;

    public LangObject(String lang) {
        this.lang = lang;
    }

    public String getLang() {
        return lang;
    }
}
