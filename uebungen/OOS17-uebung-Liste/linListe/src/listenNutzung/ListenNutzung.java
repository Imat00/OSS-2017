package listenNutzung;
import linListe.*;

public class ListenNutzung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MeineListe leer = new MeineListe();
		
		MeineListe liste123 = new MeineListe().vorhängen(3).vorhängen(2).vorhängen(1);
		MeineListe liste133 = new MeineListe().vorhängen(3).vorhängen(3).vorhängen(1);
		
//		System.out.println(append(leer,liste123));
//		System.out.println(append(liste123,liste133));
//		System.out.println(attach(leer,3));
		System.out.println(reverse(liste123));
	}

	private static LinListe reverse(LinListe liste) {
		try {
			return (attach(reverse(liste.tail()),liste.head()));
		} catch (IstLeerException e) {
			// TODO Auto-generated catch block
			return liste;
		}
	}

	private static LinListe attach(LinListe linListe, Object object) {
		// TODO Auto-generated method stub
		return append(linListe, new MeineListe().vorhängen(object));
	}

	private static LinListe append(LinListe linListe, MeineListe rechts) {
		try {
			return (append(linListe.tail(),rechts).vorhängen(linListe.head()));
		} catch (IstLeerException e) {
			return linListe;
		}
		
		
	}

}
