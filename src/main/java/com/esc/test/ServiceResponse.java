/*
 * Copyright (C) 2017 E-Science Corporation
 */
package com.esc.test;

import java.util.List;

import com.esc.test.model.ResponseList;
import com.google.gson.annotations.SerializedName;

/**
 * @author Matt Sarmiento
 * @since November 24, 2017
 */
public class ServiceResponse {

	@SerializedName("response_code")
	private String responseCode;
	@SerializedName("response_message")
	private String responseMessage;
	@SerializedName("response_list")
	private List<ResponseList> responseList;
	
	public ServiceResponse() {
	}
	
	/**
	 * returns the responseCode
	 * 
	 * @return the responseCode
	 */
	public String getResponseCode() {
		return responseCode;
	}
	
	/**
	 * sets the responseCode
	 * 
	 * @param responseCode the responseCode
	 */
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	
	/**
	 * returns the responseMessage
	 * 
	 * @return the responseMessage
	 */
	public String getResponseMessage() {
		return responseMessage;
	}
	
	/**
	 * sets the responseMessage
	 * 
	 * @param responseMessage the responseMessage
	 */
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	
	/**
	 * returns the responseList
	 * 
	 * @return the responseList
	 */
	public List<ResponseList> getResponseList() {
		return responseList;
	}
	
	/**
	 * sets the responseList
	 * 
	 * @param responseList the responseList
	 */
	public void setResponseList(List<ResponseList> responseList) {
		this.responseList = responseList;
	}
}
