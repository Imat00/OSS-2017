
public class Point {

	int x, y;
	
	Point() {
		
	}
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	Point(Point p) {
		x = p.x;
		y = p.y;
	}
	Point getLocation() {
		return this;
	}
	void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
	}
	void setLocation(Point p) {
		x = p.x;
		y = p.y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
}
