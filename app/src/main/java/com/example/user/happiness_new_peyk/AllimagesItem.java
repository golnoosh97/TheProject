package com.example.user.happiness_new_peyk;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
// FIXME: Name should be standard: AllImagesItem
// FIXME: Try to add all model classes in a package
// So move classes like AllImagesItem, Query, Response to a package called model. That way you can recognize Model classes faster and easier.
public class AllimagesItem{

	@SerializedName("ns")
	private int ns;

	@SerializedName("name")
	private String name;

	@SerializedName("descriptionurl")
	private String descriptionurl;

	@SerializedName("descriptionshorturl")
	private String descriptionshorturl;

	@SerializedName("title")
	private String title;

	@SerializedName("url")
	private String url;

	@SerializedName("timestamp")
	private String timestamp;

	public void setNs(int ns){
		this.ns = ns;
	}

	public int getNs(){
		return ns;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setDescriptionurl(String descriptionurl){
		this.descriptionurl = descriptionurl;
	}

	public String getDescriptionurl(){
		return descriptionurl;
	}

	public void setDescriptionshorturl(String descriptionshorturl){
		this.descriptionshorturl = descriptionshorturl;
	}

	public String getDescriptionshorturl(){
		return descriptionshorturl;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setTimestamp(String timestamp){
		this.timestamp = timestamp;
	}

	public String getTimestamp(){
		return timestamp;
	}

	@Override
 	public String toString(){
		return 
			"AllimagesItem{" + 
			"ns = '" + ns + '\'' + 
			",name = '" + name + '\'' + 
			",descriptionurl = '" + descriptionurl + '\'' + 
			",descriptionshorturl = '" + descriptionshorturl + '\'' + 
			",title = '" + title + '\'' + 
			",url = '" + url + '\'' + 
			",timestamp = '" + timestamp + '\'' + 
			"}";
		}
}