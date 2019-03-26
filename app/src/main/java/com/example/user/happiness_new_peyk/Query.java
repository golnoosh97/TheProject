package com.example.user.happiness_new_peyk;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Query{

	@SerializedName("allimages")
	private List<AllimagesItem> allimages;

	public void setAllimages(List<AllimagesItem> allimages){
		this.allimages = allimages;
	}

	public List<AllimagesItem> getAllimages(){
		return allimages;
	}

	@Override
 	public String toString(){
		return 
			"Query{" + 
			"allimages = '" + allimages + '\'' + 
			"}";
		}
}