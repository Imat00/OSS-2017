package prak4client.com.denis.benutzer;
import prak4client.com.denis.benutzer.*;

import java.io.IOException;

import prak4gemklassen.*;

/**
 * 
 * <p>Überschrift: Interface von BenutzerVerwaltung</p>
 * <p>Beschreibung: Dieses Interface definiert die grundlegende Methoden von BenutzerVerwaltung.java.
 * 					Die BenutzerVerwaltung benötigt folgenden Methoden:
 *  				Die Methode benutzerEintragen:
 *  					- Muss eine Exception BenutzerVorhandenException werfen 
 *  					wenn benutzer schon existiert
 *  				Die Methode benutzerOk:
 *  					- muss true zurück geben, wenn Parameterobjekt in 
 *  					Datenhaltung vorhanden, sonst false.
 * <p>Copyright: Denis (c) 2017</p>
 * <p>Organisation: FH Aachen, FB05</p>
 * @author Denis
 *
 */
public interface BenutzerVerwaltung {
	
	void benutzerEintragen(Benutzer benutzer) throws BenutzerVorhandenException, IOException, ClassNotFoundException;
	boolean benutzerOk(Benutzer benutzer) throws IOException, ClassNotFoundException;
}
