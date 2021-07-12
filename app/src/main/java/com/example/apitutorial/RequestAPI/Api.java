package com.example.apitutorial.RequestAPI;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    String BASE_URL = "https://restcountries.eu/rest/v2/region/";

    @GET("asia")
    Call<List<Result>> getCountryDetails();

}
