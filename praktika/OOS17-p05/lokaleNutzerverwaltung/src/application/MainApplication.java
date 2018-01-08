package application;
	
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.denis.benutzer.BenutzerVerwaltungAdmin;
import com.denis.benutzer.BenutzerVorhandenException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import com.denis.benutzer.Benutzer;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class MainApplication extends Application {
	
	private Stage refStage;
	
	private LoginController lc;
	
	private AnmeldungsController ac;
	
	private AnwendungsController awc;
	
	@Override
	public void start(Stage primaryStage) {
		refStage = primaryStage;
		
		
		//1. Erzeugung eines Objekts der Klasse BenutzerVerwaltungAdmin.
		BenutzerVerwaltungAdmin bva = new BenutzerVerwaltungAdmin();
		
		//2. Anfrage an den Benutzer, ob die Datenhaltung initialisiert werden soll
		System.out.println("dbInitialisieren(1/0):");
		BufferedReader din = new BufferedReader(new InputStreamReader(System.in));
		try {
			int dbInitialisieren = Integer.parseInt(din.readLine());
			if(dbInitialisieren == 1) {
				bva.dbInitialisieren();
				System.out.println("Initialisiere Benutzer.DB Datei...");
			} else if(dbInitialisieren == 0) {
				System.out.println("Initialisierung übersprungen");
			}
		} catch (NumberFormatException | IOException | ClassNotFoundException e1) {
			e1.printStackTrace();
		}
				
		//3. Erzeugung einer LoginScene mit Übergabe der eigenen Referenz an deren Controller			
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
			Parent root = loader.load();
			lc = loader.getController();
			lc.setORB(this);
			refStage.setTitle("Benutzerverwaltung - Login");
			refStage.setScene(new Scene(root));
			refStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Die Scene wird durch eine AnmeldungsScene ersetzt und deren
	 * Controller wird die eigene Referenz übergeben.
	 */
	void neuAnmeldung() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Anmeldung.fxml"));
			Parent root = loader.load();
			ac = loader.getController();
			ac.setORB(this);
			refStage.setTitle("Benutzerverwaltung - Anmeldung");
			refStage.setScene(new Scene(root));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Es wird versucht den neuen Benutzer durch Aufruf der Methode
	 * benutzerEintragen(benutzer)in die BenutzerVerwaltungAdmin
	 * einzutragen.
	 * Ist dies erfolgreich, so soll dem Anwender angezeigt werden, dass er
	 * jetzt den Login-Vorgang durchführen kann (indem eine LoginScene
	 * erzeugt und deren Controller die eigene Referenz übergeben wird).
	 * Beim Auftreten der Exception soll eine aussagekräftige Fehlermeldung
	 * angezeigt werden (z.B. in dem obersten Textfeld der
	 * AnmeldungsScene). Der Benutzer hat nun die Möglichkeit sich mit
	 * anderer ID oder Passwort einzutragen.
	 * @param benutzer
	 */
	void neuerBenutzer(Benutzer benutzer){
		BenutzerVerwaltungAdmin bva = new BenutzerVerwaltungAdmin();
		
		try {
			bva.benutzerEintragen(benutzer);

			try {
				FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
				Parent root = loader.load();
				lc = loader.getController();
				lc.setORB(this);
				refStage.setTitle("Benutzerverwaltung - Login");
				refStage.setScene(new Scene(root));
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
			ac.showErrorMessage("Ein Fehler ist aufgetreten!");
		} catch (BenutzerVorhandenException e) {
			e.printStackTrace();
			ac.showErrorMessage("Der Benutzer existiert bereits!");
		} 
	}
	
	/**
	 * Es wird durch Aufruf der Methode benutzerOk(benutzer) überprüft,
	 * ob der Benutzer bereits in BenutzerVerwaltungAdmin eingetragen ist.
	 * Ist dies der Fall, soll dem Anwender angezeigt werden, dass er nun
	 * das System benutzen kann, indem eine AnwendungsScene erzeugt
	 * wird (er kann jedoch lediglich nur den Button drücken).
	 * Im anderen Fall soll eine aussagekräftige Fehlermeldung angezeigt
	 * werden (z.B. in dem obersten Textfeld der LoginScene). Der Benutzer
	 * hat nun die Möglichkeit, sich mit anderer ID oder Passwort
	 * anzumelden.
	 * @param ben
	 */
	public void benutzerLogin(Benutzer ben) {
		BenutzerVerwaltungAdmin bva = new BenutzerVerwaltungAdmin();
		if(bva.benutzerOk(ben)) {
			try {
				FXMLLoader loader = new FXMLLoader(getClass().getResource("Anwendung.fxml"));
				Parent root = loader.load();
				awc = loader.getController();
				awc.setORB(this);
				refStage.setTitle("Benutzerverwaltung - Anwendung");
				refStage.setScene(new Scene(root));
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			lc.showErrorMessage("Benutzer ist nicht vorhanden!");
		}
		System.out.println(ben);
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
