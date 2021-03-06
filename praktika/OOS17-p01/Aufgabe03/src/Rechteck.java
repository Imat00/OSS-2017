
public class Rechteck implements Geom {

	/**
	 * Attribut zur Speicherung des oberen linken Punkt des Rechtecks
	 */
	Point p1 = new Point();
	
	/**
	 * Attribut zur Speicherung des unteren rechten Punkt des Rechtecks
	 */
	Point p2 = new Point();
	
	Rechteck() {
		
	}
	
	Rechteck(Point p1, Point p2) {
		this.p1.x = p1.x;
		this.p1.y = p1.y;
		this.p2.x = p2.x;
		this.p2.y = p2.y;
	}
	
	Rechteck(Rechteck r) {
		this.p1.x = r.p1.x;
		this.p1.y = r.p1.y;
		this.p2.x = r.p2.x;
		this.p2.y = r.p2.y;
	}
	
	void setP1(int x, int y) {
		p1.x = x;
		p1.y = y;
	}
	
	void setP1(Point x) {
		p1.x = x.x;
		p1.y = x.y;
	}
	
	Point getP1() {
		return p1.clone();
	}
	
	void setP2(int x, int y) {
		p2.x = x;
		p2.y = y;
	}
	
	void setP2(Point x) {
		p2.x = x.x;
		p2.y = x.y;
	}
	
	Point getP2() {
		return p2.clone();
	}
	
	public double getSurface() {
		int x = 0;
		int y = 0;
		
		if(p1.x < p2.x) {
			x = p2.x - p1.x;
		}
		else {
			x = p1.x - p2.x;
		}
		
		if(p1.y < p2.y) {
			y = p2.y - p1.y;
		}
		else {
			y = p1.y - p2.y;
		}
		return x * y;
		
	}
	
	boolean equals(Rechteck k) {
		return (p1.equals(k.p1) &&
				p2.equals(k.p2));
	}
	
	public Rechteck clone() {
		return new Rechteck(this);
	}
}
