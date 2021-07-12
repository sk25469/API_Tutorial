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

    Country country1 = new Country("India", "New Delhi", "Asia", "Southern Asia", "120 Crores"
            , "Hindi, English", "PAK, CHINA", "https://restcountries.eu/data/ind.svg");

    Country country2 = new Country("Sri Lanka", "Kathmandu", "Asia", "Southern Asia", "50 Crores"
            , "Hindi, English, Tamil", "INDIA", "https://restcountries.eu/data/lka.svg");

    Country country3 = new Country("Bangladesh", "I dont know", "Asia", "Southern Asia", "60 Crores"
            , "Hindi, English, Bengali", "Myanmar", "https://restcountries.eu/data/bgd.svg");

    Country country4 = new Country("Pakistan", "Islamabad", "Asia", "Southern Asia", "55 Crores"
            , "Hindi, English, Urdu", "INDIA", "https://restcountries.eu/data/pak.svg");
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

        countryArrayList.add(country1);
        countryArrayList.add(country2); countryArrayList.add(country3); countryArrayList.add(country4);

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

//        RequestOptions options = new RequestOptions()
//                .centerCrop()
//                .placeholder(R.mipmap.ic_launcher_round)
//                .error(R.mipmap.ic_launcher_round);
//
//        Glide.with(this).load(country.getFlagUrl()).apply(options).into(flag);

        Glide.with(this)
                .load(country.getFlagUrl())
                .error(R.mipmap.ic_launcher)
                .placeholder(R.mipmap.ic_launcher)
                .into(flag);
    }
}
