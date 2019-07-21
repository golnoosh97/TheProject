package com.example.user.happiness_new_peyk;

import retrofit2.Call;
import retrofit2.http.GET;

// FIXME: You can move all Classes related to network to a package called network
// So move ItemAPI (Which better to be NetworkUtils or NetworkManager) and this to network folder
public interface MyApi  {

    @GET("w/api.php?action=query&format=json&list=allimages&aifrom=Graffiti_000&ailimit=10")
    // FIXME: getAllImages is a better name
    Call<Response> getAllimagesItemList ();
}
