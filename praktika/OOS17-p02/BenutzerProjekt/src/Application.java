import com.denis.benutzer.*;

/**
 * 
 * <p>�berschrift: Hauptklasse Application</p>
 * <p>Beschreibung: Diese Klasse dient zur Ausf�hrung des Programms �ber die Methode main.</p>
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
		
		BenutzerVerwaltungAdmin bva = new BenutzerVerwaltungAdmin();
		
		Benutzer b1 = new Benutzer("Denis", "passwort123");
		Benutzer b2 = new Benutzer("Constantin", "passwort123");
		Benutzer b3 = new Benutzer("Fred", "passwort123");
		Benutzer b4 = new Benutzer("Rick", "passwort123");
		Benutzer b5 = new Benutzer("Rick", "passwort123");
		
		
		try {
			bva.benutzerEintragen(b1);
			
			if(bva.benutzerOk(b1)) {
				bva.benutzerL�schen(b1);
			}
			
			System.out.println("b1 gleich b2: " + b1.equals(b2));
			
			bva.benutzerEintragen(b2);
			bva.benutzerEintragen(b3);
			bva.benutzerEintragen(b4);
			
			if(bva.benutzerOk(b4)) {
				bva.benutzerL�schen(b4);
			}
			
			System.out.println("b4 gleich b5: " + b4.equals(b5));
			
			bva.benutzerEintragen(b5);
			

		} catch (BenutzerVorhandenException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}