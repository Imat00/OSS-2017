package application;

import com.denis.benutzer.Benutzer;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.stage.*;

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
	
	@FXML
	public void onBtnAusfuehrenClick(Event e) {
		
		if(txtPasswort.getText().equals(txtWiederholung.getText())) {
		
			Benutzer ben = new Benutzer(txtUsrID.getText(),txtPasswort.getText());
			System.out.println(ben);
			Stage window = (Stage) txtUsrID.getScene().getWindow();
			window.close();
		
		}
		else {
			
			lblErrorMessage.setVisible(true);
		
		}
		
	}
	
	@FXML
	public void ontxtPasswortChange(Event e){
		
		lblErrorMessage.setVisible(false);
		
	}
	
}
