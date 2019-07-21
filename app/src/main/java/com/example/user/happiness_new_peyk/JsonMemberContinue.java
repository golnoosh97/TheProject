package com.example.user.happiness_new_peyk;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class JsonMemberContinue{

	@SerializedName("continue")
	private String jsonMemberContinue;

	@SerializedName("aicontinue")
	// FIXME: No need to keep the name like this. Follow camelCase for variable and methods names
	private String aicontinue;

	public void setJsonMemberContinue(String jsonMemberContinue){
		this.jsonMemberContinue = jsonMemberContinue;
	}

	public String getJsonMemberContinue(){
		return jsonMemberContinue;
	}

	public void setAicontinue(String aicontinue){
		this.aicontinue = aicontinue;
	}

	public String getAicontinue(){
		return aicontinue;
	}

	@Override
 	public String toString(){
		return 
			"JsonMemberContinue{" + 
			"continue = '" + jsonMemberContinue + '\'' + 
			",aicontinue = '" + aicontinue + '\'' + 
			"}";
		}
}