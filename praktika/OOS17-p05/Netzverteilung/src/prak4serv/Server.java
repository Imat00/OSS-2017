package prak4serv;

import java.io.IOException;

import prak4serv.com.denis.benutzer.BenutzerVerwaltungAdmin;

public class Server {

	public Server() throws IOException, ClassNotFoundException{
		BenutzerVerwaltungAdmin bva = new BenutzerVerwaltungAdmin();
		ServerOrb so = new ServerOrb(bva);
	}
	
	public static void main(String[] args) {
		try {
			Server s = new Server();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.err.println("Server wird heruntergefahren...");
	}
	
}
