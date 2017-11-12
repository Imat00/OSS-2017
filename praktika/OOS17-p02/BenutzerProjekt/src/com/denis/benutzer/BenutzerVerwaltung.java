package com.denis.benutzer;

/**
 * 
 * <p>�berschrift: Interface von BenutzerVerwaltung</p>
 * <p>Beschreibung: Dieses Interface definiert die grundlegende Methoden von BenutzerVerwaltung.java.
 * 					Die BenutzerVerwaltung ben�tigt folgenden Methoden:
 *  				Die Methode benutzerEintragen:
 *  					- Muss eine Exception BenutzerVorhandenException werfen 
 *  					wenn benutzer schon existiert
 *  				Die Methode benutzerOk:
 *  					- muss true zur�ck geben, wenn Parameterobjekt in 
 *  					Datenhaltung vorhanden, sonst false.
 * <p>Copyright: Denis (c) 2017</p>
 * <p>Organisation: FH Aachen, FB05</p>
 * @author Denis
 *
 */
public interface BenutzerVerwaltung {
	
	void benutzerEintragen(Benutzer benutzer) throws BenutzerVorhandenException;
	boolean benutzerOk(Benutzer benutzer);
}
