package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class MainApplication extends Application {
	@Override
	public void start(Stage primaryStage) {
        Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("Login.fxml"));
			primaryStage.setTitle("Benutzerverwaltung");
	        primaryStage.setScene(new Scene(root));
	        primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
