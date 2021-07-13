package com.example.apitutorial;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.apitutorial.Room.Data;
import com.example.apitutorial.Room.DatabaseRepository;

public class CountryActivity extends AppCompatActivity {

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

        DatabaseRepository databaseRepository = new DatabaseRepository(this);
        Data data = databaseRepository.getTask(country_bundle);
//        Log.d(String.valueOf(getApplicationContext()), "Country name is " + data.getCountryName())  ;
        displayInfo(data);

    }

    private void displayInfo(Data data) {
        countryName.setText(data.getCountryName());
        capitalName.setText(data.getCapitalName());
        region.setText(data.getRegionName());
        subregion.setText(data.getSubregion());
        population.setText(data.getPopulation());
        borders.setText(data.getCountryBorder());
        languages.setText(data.getCountryLang());

        Glide.with(this)
                .load(data.getFlagUrl())
                .error(R.mipmap.ic_launcher)
                .placeholder(R.mipmap.ic_launcher)
                .into(flag);
    }
}
