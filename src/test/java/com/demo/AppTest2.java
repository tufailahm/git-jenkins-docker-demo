package com.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest2 {

	App app;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		app = new App();
	}

	@After
	public void tearDown() throws Exception {
		app = null;
	}

	@Test
	public void testSum1() {
			assertEquals(10, app.sum(5, 5));
	}
	@Test
	public void testSum2() {
			assertEquals(6, app.sum(3, 3));
	}
	@Test
	public void testSum3() {
			assertEquals(134, app.sum(67, 67));
	}
}
