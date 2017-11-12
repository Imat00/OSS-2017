package com.denis.benutzer;

/**
 * 
 * <p>Überschrift: BenutzerVorhandenException</p>
 * <p>Beschreibung: Diese Klasse definiert die Exception BenutzerVorhandenException.java.
 * 					Diese Exception soll geworfen werden, wenn ein Benutzer existiert/ nicht existiert.</p>
 *  
 * <p>Copyright: Denis (c) 2017</p>
 * <p>Organisation: FH Aachen, FB05</p>
 * @author Denis
 *
 */
public class BenutzerVorhandenException extends Exception {

	public BenutzerVorhandenException(String s) {
		super(s);
	}
	
}
