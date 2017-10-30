
public class Auto {

	String typ;
	String farbe;
	int baujahr;
	int kmStand;
	int inspektionsIntervall;
	
	Auto(int baujahr, int kmStand, int inspektionsIntervall) {
		this.baujahr = baujahr;
		this.kmStand = kmStand;
		this.inspektionsIntervall = inspektionsIntervall;
	}
	
	Auto(String typ, String farbe, int baujahr, int kmStand, int inspektionsIntervall) {
		this(baujahr, kmStand, inspektionsIntervall);
		this.typ = typ;
		this.farbe = farbe;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
