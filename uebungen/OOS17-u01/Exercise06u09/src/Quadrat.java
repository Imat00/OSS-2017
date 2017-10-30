
public class Quadrat extends Point {

	int laenge;
	
	Quadrat() {
		
	}
	
	Quadrat(int x, int y, int laenge) {
		super(x,y);
		this.laenge = laenge;
	}
	
	Quadrat(Point p, int laenge) {
		super(p);
		this.laenge = laenge;
	}
	
	int Flaeche() {
		return (laenge * laenge);
	}
	
	@Override
	public String toString() {
		return "Quadrat [laenge=" + laenge + ", " + super.toString() + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Quadrat other = (Quadrat) obj;
		if (laenge != other.laenge)
			return false;
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point(1,3);
		Quadrat q = new Quadrat(p,5);
		System.out.println(q);
		
	}

}
