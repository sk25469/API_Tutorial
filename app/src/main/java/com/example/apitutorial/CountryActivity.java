package com.example.apitutorial;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.apitutorial.Model.Country;

import java.util.ArrayList;

public class CountryActivity extends AppCompatActivity {

    ArrayList<Country> countryArrayList = new ArrayList<>();

    private TextView countryName, capitalName, region, subregion, population, borders, languages;
    ImageView flag;


    @Override
    protected void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.country_details);

        countryName = findViewById(R.id.country);
        capitalName = findViewById(R.id.country_capital);
        region = findViewById(R.id.country_region);
        subregion = findViewById(R.id.country_subregion);
        population = findViewById(R.id.country_population);
        borders = findViewById(R.id.country_borders);
        languages = findViewById(R.id.country_lang);
        flag = findViewById(R.id.country_flag);

        String country_bundle = getIntent().getStringExtra("country_name");

        for(Country countries : countryArrayList){
            if(countries.getCountryName().equals(country_bundle)){
                displayInfo(countries);
            }
        }

    }

    private void displayInfo(Country country){
        countryName.setText(country.getCountryName());
        capitalName.setText(country.getCapitalName());
        region.setText(country.getRegion());
        subregion.setText(country.getSubregion());
        population.setText(country.getPopulation());
        borders.setText(country.getBorders());
        languages.setText(country.getLanguages());

        Glide.with(this)
                .load(country.getFlagUrl())
                .error(R.mipmap.ic_launcher)
                .placeholder(R.mipmap.ic_launcher)
                .into(flag);
    }
}
