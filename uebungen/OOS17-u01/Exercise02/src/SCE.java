
public class SCE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean expression = true;
		StringBuilder ausgabe = new StringBuilder("Ausgabe!");
		
		// Short Circuit Evaluation führt hier zu anderem Ergebnis
		if(expression | func(ausgabe)) {
			System.out.println(ausgabe);
		}
		
	}

	// Da String immutable ist muss StringBuilder verwendet werden!
	private static boolean func(StringBuilder a) {
		a.delete(0, a.length());
		a.append("Andere Ausgabe!");
		return true;
	}

}
