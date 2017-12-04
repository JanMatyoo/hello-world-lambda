/*
 * Copyright (C) 2017 E-Science Corporation
 */
package com.esc.test.model;

import com.google.gson.annotations.SerializedName;

/**
 * @author Matt Sarmiento
 * @since November 24, 2017
 */
public class ResponseList {
	
	@SerializedName("first_name")
	private String firstName;
	@SerializedName("middle_name")
	private String middleName;
	@SerializedName("last_name")
	private String lastName;
	
	public ResponseList() {
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getMiddleName(){
		return middleName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
