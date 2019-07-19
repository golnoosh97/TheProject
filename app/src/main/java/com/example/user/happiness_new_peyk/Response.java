package com.example.user.happiness_new_peyk;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Response{

	@SerializedName("batchcomplete")
	private String batchcomplete;

	@SerializedName("continue")
	private JsonMemberContinue jsonMemberContinue;

	@SerializedName("query")
	private Query query;

	public void setBatchcomplete(String batchcomplete){
		this.batchcomplete = batchcomplete;
	}

	public String getBatchcomplete(){
		return batchcomplete;
	}

	public void setJsonMemberContinue(JsonMemberContinue jsonMemberContinue){
		this.jsonMemberContinue = jsonMemberContinue;
	}

	public JsonMemberContinue getJsonMemberContinue(){
		return jsonMemberContinue;
	}

	public void setQuery(Query query){
		this.query = query;
	}

	public Query getQuery(){
		return query;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"batchcomplete = '" + batchcomplete + '\'' + 
			",continue = '" + jsonMemberContinue + '\'' + 
			",query = '" + query + '\'' + 
			"}";
		}


	public static void main(String[] args) {
		System.out.println("jddjdbdkb");
	}
}