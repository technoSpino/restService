package com.barcrawl.test.db;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mongodb.DB;
import com.mongodb.Mongo;

public class TestMongoConnection {
	Mongo m;
	@Before
	public void setUp() throws Exception {
		m = new Mongo("127.30.0.1");
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConnection() {
		assertEquals(m.getDatabaseNames().contains("test"),true);
	}
	
	@Test
	public void testDB() {
		DB db = m.getDB("restService");
		assertEquals(db.getName(),"restService");
		
	}

}
