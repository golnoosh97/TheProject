package com.example.user.happiness_new_peyk;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MyApi  {

    @GET("w/api.php?action=query&format=json&list=allimages&aifrom=Graffiti_000&ailimit=10")
    Call<PojoResponse> getPojo(@Query("filter") String filter);
}
