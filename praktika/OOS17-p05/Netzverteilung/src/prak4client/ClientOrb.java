package prak4client;

import java.io.*;
import java.net.*;

import prak4client.com.denis.benutzer.BenutzerVerwaltung;
import prak4gemklassen.*;

public class ClientOrb implements BenutzerVerwaltung{

	private String address;
	
	private int port;
	
	private Client refMainApplication;
	
	public ClientOrb(String address, int port){
		this.address = address;
		this.port = port;
	}
	
	public ClientOrb() {
		this.address = "localhost";
		this.port = 4711;
	}

	public void setAddress(String address) {
		this.address = new StringBuilder(address).toString();
	}
	
	public void setPort(int port) {
		this.port = port;
	}
	
	public void benutzerEintragen(Benutzer ben) throws BenutzerVorhandenException, IOException, ClassNotFoundException {
		Socket server = new Socket(address, port);
		ObjectOutputStream out =  new ObjectOutputStream(server.getOutputStream());
		ObjectInputStream in =  new ObjectInputStream(server.getInputStream());
		out.writeObject("benutzerEintragen");
		out.writeObject(ben);
		out.flush();
		
		String response = in.readObject().toString();
		server.close();
		if(response.equals("BenutzerVorhandenException")) {
			throw new BenutzerVorhandenException("Dieser Benutzer existiert bereits!");
		}
		
	}

	public boolean benutzerOk(Benutzer ben) throws IOException, ClassNotFoundException {
		Socket server = new Socket(address, port);
		ObjectOutputStream out =  new ObjectOutputStream(server.getOutputStream());
		ObjectInputStream in =  new ObjectInputStream(server.getInputStream());
		out.writeObject("benutzerOk");
		out.writeObject(ben);
		out.flush();
		boolean response = in.readBoolean();
		server.close();
		return response;
	}
	
	public void setORB(Client ma) {
		// TODO Auto-generated method stub
		refMainApplication = ma;
	}
}
