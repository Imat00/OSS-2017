import java.io.IOException;
import com.denis.benutzer.*;

/**
 * 
 * <p>Überschrift: Hauptklasse Application</p>
 * <p>Beschreibung: Diese Klasse dient zur Ausführung des Programms über die Methode main.</p>
 *  
 * <p>Copyright: Denis (c) 2017</p>
 * <p>Organisation: FH Aachen, FB05</p>
 * @author Denis
 *
 */
public class Application {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BenutzerVerwaltungAdmin bva;
		Benutzer b1 = new Benutzer("Denis564", "passwort123");
		Benutzer b2 = new Benutzer("Constantin643", "passwort123");
		Benutzer b3 = new Benutzer("Fred244", "passwort123");
		Benutzer b4 = new Benutzer("Rick146", "passwort123");
		Benutzer b5 = new Benutzer("Rickb5464", "passwort123");
		Benutzer b6 = new Benutzer("Peter446","123");
		Benutzer b7 = new Benutzer();

		
		try {
			
			bva = new BenutzerVerwaltungAdmin();
			bva.dbInitialisieren();
			System.out.println(bva);
			bva.benutzerEintragen(b1);
			bva.benutzerEintragen(b2);
			bva.benutzerEintragen(b3);
			bva.benutzerEintragen(b4);
			bva.benutzerEintragen(b5);
			bva.benutzerEintragen(b6);
			bva.benutzerEintragen(b7);
			bva.benutzerLöschen(b7);
			bva.benutzerEintragen(new Benutzer("Hallo26","pw"));
			System.out.println(bva);
		} 
		catch (IOException e) {
			e.printStackTrace();
		} 
		catch (BenutzerVorhandenException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
