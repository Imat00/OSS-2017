package linListe;

public class MeineListe implements LinListe {
  
	class Node {
		Object item;
		Node next;
		Node(Object item) {
			this.item = item;
		}
	}
	
	private Node head = null;	
	
	@Override
	public LinListe erzeugeLeereListe() {
    return (new MeineListe());
	}

	@Override
	public MeineListe vorhängen(Object obj) {
		MeineListe ml = (MeineListe) this.clone();
		Node newHead = new Node(obj);
		newHead.next = ml.head;
		ml.head = newHead;
		return ml;
	}

	@Override
	public boolean isEmpty() {
		return (this.head == null);
	}

	@Override
	public Object head() throws IstLeerException {
		if (this.isEmpty()) {
			throw new IstLeerException("Leider Liste leer!");
		}
		return this.head.item;
	}

	@Override
	public LinListe tail() throws IstLeerException {
		if (this.isEmpty()) {
			throw new IstLeerException("Leider Liste leer!");
		}
		MeineListe ml = new MeineListe();
		ml.head = this.head.next;
		return ml;
	}
	
	public boolean equals(Object obj) {
		LinListe ml = (MeineListe) obj;
		try {
			return ((this.isEmpty() && ml.isEmpty()) || 
								this.head().equals(ml.head()) && this.tail().equals(ml.tail()));
		} catch (IstLeerException e) {
			return false;
		}
	}
	
	protected LinListe clone() {
		try {
			return ((MeineListe) this.tail()).clone().vorhängen(this.head());
		} catch (IstLeerException e) {
			return this.erzeugeLeereListe();
		}
	}
	
	public String toString() {
	
		try {
			return this.head().toString() + this.tail().toString();
		} catch (IstLeerException e) {
			return "";
		}
	}

	
}
