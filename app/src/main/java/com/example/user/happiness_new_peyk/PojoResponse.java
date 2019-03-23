package com.example.user.happiness_new_peyk;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PojoResponse {

    @SerializedName("batchcomplete")

    private List<Pojo> pojoList;

    public List<Pojo> getpojo() {
        return  pojoList;
    }

    public void setPojo(List<Pojo>pojoList) {
        this.pojoList=pojoList;
    }
}
