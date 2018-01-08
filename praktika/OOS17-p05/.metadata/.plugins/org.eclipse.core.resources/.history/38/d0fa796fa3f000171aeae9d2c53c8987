package application;

import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.stage.*;

public class AnwendungsController {
	
	@FXML
	Label lblStartScreenBanner;
	
	@FXML
	Button btnCancel;

	private MainApplication refMainApplication;
	
	@FXML
	public void onBtnCancelClick(Event e){ 
		
		System.out.println("onBtnCancelClick ausgeführt!");
		System.out.println("Fenster Anwendung wird geschlossen.");
		Stage window = (Stage) btnCancel.getScene().getWindow();
		window.close();
	}

	public void setORB(MainApplication ma) {
		// TODO Auto-generated method stub
		refMainApplication = ma;
	}
	
}
