package com.example.user.happiness_new_peyk;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Entity(tableName = "AllimagesItem")
@Generated("com.robohorse.robopojogenerator")
public class AllimagesItem{

	//@PrimaryKey(autoGenerate = true)
	@SerializedName("ns")
	private int ns;

	@SerializedName("name")
	private String name;

	@SerializedName("descriptionurl")
	private String descriptionurl;

	@SerializedName("descriptionshorturl")
	private String descriptionshorturl;

    @PrimaryKey(autoGenerate = true)
	@ColumnInfo(name = "title")
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