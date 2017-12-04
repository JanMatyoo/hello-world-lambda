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
public class ServiceRequest {
	
	@SerializedName("form_id")
	private int formId;
	@SerializedName("form_name")
	private String formName;
	@SerializedName("response_list")
	private List<ResponseList> responseList;
	
	public ServiceRequest() {
	}

	/**
	 * returns the formId
	 * 
	 * @return the formId
	 */
	public int getFormId() {
		return formId;
	}
	
	/**
	 * sets the formId
	 * 
	 * @param formId the formId
	 */
	public void setFormId(int formId) {
		this.formId = formId;
	}
	
	/**
	 * returns the formName
	 * 
	 * @return the formName
	 */
	public String getFormName() {
		return formName;
	}
	
	/**
	 * sets the formName
	 * 
	 * @param formId the formName
	 */
	public void setFormName(String formName) {
		this.formName = formName;
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
