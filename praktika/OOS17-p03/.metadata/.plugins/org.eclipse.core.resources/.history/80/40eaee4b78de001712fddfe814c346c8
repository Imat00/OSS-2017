package com.denis.benutzer;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BenutzerTest {

	private Benutzer b1;
	private Benutzer b2;
	private Benutzer b3;
	private Benutzer b4;
	private Benutzer b5;
	private Benutzer b6;
	private Benutzer b7;

	private Benutzer setb1;
	private Benutzer setb2;
	private Benutzer setb3;
	private Benutzer setb4;
	private Benutzer setb5;
	private Benutzer setb6;

	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {		
		
		setb1 = new Benutzer("Denis", "passwort123");
		setb2 = new Benutzer("Constantin", "passwort123");
		setb3 = new Benutzer("Fred", "passwort123");
		setb4 = new Benutzer("Rick", "passwort123");
		setb5 = new Benutzer("Rick", "passwort123");
		setb6 = new Benutzer("Peter","123");

	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void testBenutzerOhneParameter() {
		
		b7 = new Benutzer();
		Benutzer b8 = new Benutzer();
		assertEquals(b7, b8);
		if(b7.userId != "") {
			fail("Benuzter userId ist nicht \"\"");
		}
		if(b7.userId == null) {
			fail("Benutzer userId ist null");
		}
	}

	@Test
	public void testBenutzerStringString() {
		
		b1 = new Benutzer("Denis", "passwort123");
		b2 = new Benutzer("Constantin", "passwort123");
		b3 = new Benutzer("Fred", "passwort123");
		b4 = new Benutzer("Rick", "passwort123");
		b5 = new Benutzer("Rick", "passwort123");
		b6 = new Benutzer("Peter","123");

	}

	@Test
	public void testToStringEquals() {
		assertEquals(setb4.toString(), setb5.toString());
		
	}
	
	@Test
	public void testToStringNotEquals() {
		assertNotEquals(setb1.toString(), setb6.toString());
		
	}

	@Test
	public void testEqualsObjectTrue() {
		assertTrue(setb4.equals(setb5));
		assertTrue(setb4.equals(setb4));
		
	}

	@Test
	public void testEqualsObjectFalse() {
		assertFalse(setb4.equals(setb6));
		assertFalse(setb4.equals(setb1));
		assertFalse(setb4.equals(setb2));
		assertFalse(setb4.equals(setb3));
		assertFalse(setb4.equals(null));
		
	}
}
