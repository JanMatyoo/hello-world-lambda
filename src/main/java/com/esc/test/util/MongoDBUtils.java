/*
 * Copyright (C) 2017 E-Science Corporation
 */
package com.esc.test.util;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.esc.test.constants.Strings;
import com.esc.test.constants.Integers;

/**
 * @author Matt Sarmiento
 * @since October 19, 2017
 */
public abstract class MongoDBUtils {
	
	public static MongoDatabase getDatabase() {
		
		MongoClient mongoClient = new MongoClient(Strings.HOST, Integers.PORT);		
		MongoDatabase mongoDatabase = mongoClient.getDatabase(Strings.DATABASE);
		
		return mongoDatabase;
	}

}
