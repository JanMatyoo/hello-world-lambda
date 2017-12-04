package com.esc.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;

import org.bson.Document;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import com.esc.test.util.MongoDBUtils;
import com.esc.test.ClientException;
import com.esc.test.ServiceRequest;
import com.esc.test.ServiceResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.mongodb.BasicDBObject;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Projections;



public class Application implements RequestStreamHandler {

	public void handleRequest(InputStream inputStream, OutputStream outputStream, Context context) throws IOException {
		LambdaLogger logger = context.getLogger();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		ServiceRequest serviceRequest = new ServiceRequest();
		ServiceResponse serviceResponse = new ServiceResponse();

		try {

			try {
				
				Reader reader = new InputStreamReader(inputStream, "UTF-8");
				serviceRequest = gson.fromJson(reader, ServiceRequest.class);
				logger.log("PSD JSON Request : " + gson.toJson(serviceRequest));
			} catch (JsonParseException e) {
				logger.log("Unhandled error occurred." + e);
				throw new ClientException("Invalid JSON format.");
			}
			
			
			serviceResponse.setResponseCode("001");
			serviceResponse.setResponseMessage("Form Id: " + serviceRequest.getFormId() + ", Form Name: " + serviceRequest.getFormName());
			serviceResponse.setResponseList(serviceRequest.getResponseList());

		    outputStream.write(gson.toJson(serviceResponse).getBytes());
		
		} catch (ClientException e) {
			logger.log("Unhandled error occurred." + e);
		} catch (IOException e) {
			logger.log("Unhandled error occurred." + e);
			//throw new ClientException("Unhandled error occurred.");
		}
		

	}

}
