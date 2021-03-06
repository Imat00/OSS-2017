
public class KreisVererb extends Point {

	double r;
	
	KreisVererb() {
		
	}
	
	KreisVererb(KreisVererb k) {
		this.x = k.x;
		this.y = k.y;
		this.r = k.r;
	}
	
	KreisVererb(Point p, double r) {
		this.x = p.x;
		this.y = p.y;
		this.r = r;
	}
	
	KreisVererb(int x, int y, double r) {
		this.x = x;
		this.y = y;
		this.r = r;		
	}
	
	void setRadius(double r) {
		this.r = r;
	}
	
	double getRadius() {
		return r;
	}
	
	double getSurface() {
		return Math.PI * r * r;
	}
	
	boolean equals(KreisVererb k) {
		return (k.r == r && 
				k.x == x &&
				k.y == y);
	}
	
	public String toString() {
		return "[x=" + x + ", y=" + y + ", r=" + r + ", A=" + getSurface() + "]";
	}
	
}
