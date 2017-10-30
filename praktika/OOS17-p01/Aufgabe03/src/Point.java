/**
 * <p>Überschrift: Genereller Punkt in Koordinatensystem</p>
 * <p>Beschreibung: Diese Klasse definiert die grundlegende Struktur eines Punktes 
 * 					mit Koordinatenangaben
 * 					Die Struktur eines Punktes setzt sich zusammen aus:
 * 					- x Koordinaten
 * 					- y Koordinaten
 * 
 * 					Die Klasse beinhaltet 3 Konstruktoren:
 * 					- Point()
 * 					- Point(x:int,y:int)
 * 					- Point(p:Point)
 * 
 * 
 * 
 * @author Denis
 * @version 1.0
 */
public class Point {
	
	/**
	 * Attribut zur Speicherung der x Koordinate
	 */
	int x;
	
	/**
	 * Attribut zur Speicherung der y Koordinate
	 */
	int y;
	
	Point(){
		
	}
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	Point(Point p){
		this.x = p.x;
		this.y = p.y;
	}
	
	/**
	 * 
	 */
	Point getLocation(){
		return new Point(this.x,this.y);
	}
	
	void setLocation(Point p){
		this.x = p.x;
		this.y = p.y;
	}
	
	void setLocation(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	void move(int dx, int dy){
		this.x += dx;
		this.y += dy;
	}
	
	boolean equals(Point p){
		return (this.x == p.x && this.y == p.y);
	}
	
	public String toString(){
		return "[x=" + x + "," + 
				" y=" + y + "]";
	}
	
	public Point clone() {
		return new Point(this);
	}
	
}
