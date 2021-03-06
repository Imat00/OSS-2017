package prak4client;

import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.*;
import prak4gemklassen.*;

public class AnmeldungsController {

	@FXML
	Label lblErrorMessage;
	
	@FXML
	TextField txtUsrID;
	
	@FXML
	PasswordField txtPasswort;
	
	@FXML
	PasswordField txtWiederholung;
	
	@FXML
	Button btnAusfuehren;
	
	Client refMainApplication;
	
	public void showErrorMessage(String s) {
		lblErrorMessage.setText(s);
		lblErrorMessage.setVisible(true);
	}
	
	public void setORB(Client ma){
		refMainApplication = ma;
	}
	
	@FXML
	public void onBtnAusfuehrenClick(Event e) {
		if(txtPasswort.getText().equals(txtWiederholung.getText())) {
			Benutzer ben = new Benutzer(txtUsrID.getText(),txtPasswort.getText());
			refMainApplication.neuerBenutzer(ben);
		} else {
			showErrorMessage("Passwort != Wiederholung");
		}
	}
	
	@FXML
	public void ontxtPasswortChange(Event e){
		lblErrorMessage.setVisible(false);
	}
	
}
