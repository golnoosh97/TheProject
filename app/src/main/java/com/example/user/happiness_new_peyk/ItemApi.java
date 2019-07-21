package com.example.user.happiness_new_peyk;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

// FIXME: Give a better name like NetworkManager
public class ItemApi {

    private static final String BASE_URL = "https://en.wikipedia.org/";

    private static Retrofit retrofit = null;


    // FIXME: Can be better named like retrofit()
    public static Retrofit getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}


