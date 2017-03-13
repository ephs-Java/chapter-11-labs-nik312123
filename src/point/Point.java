package point;

public class Point {

	// instance variables
	private int x, y;

	// construct the object here.
	
	public Point() {
		this(0,0);
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// Returns which quadrant of the x/y plane this Point
	// object falls in. Quadrant 1 contains all points
	// whose x and y values are both positive. Quadrant
	// 2 contains all points with negative x but positive y.
	// Quadrant 3 contains all points with negative x and y values.
	// Quadrant 4 contains all points with positive x but negative y.
	// If the point lies directly on the x and/or y axis, return 0.
	// bob.quadrant(); --> 2
	
	public int quadrant() {
		if(x > 0 && y > 0)
			return 1;
		else if(x < 0 && y > 0)
			return 2;
		else if(x < 0 && y < 0)
			return 3;
		else if(x > 0 && y < 0)
			return 4;
		return 0;
	}

	// Negates and swaps the x/y coordinates of the Point object.
	// For example, if an object pt initially represents the
	// point (5, -3), after a call of pt.flip(); , the object
	// should represent (3, -5). If the same object initially
	// represents the point (4, 17), after a call to pt.flip();,
	// the object should represent (-17, -4).
	
	public void flip() {
		int temp = -1 * x;
		x = -1 * y;
		y = temp;
	}
	
	// Modify the toString method in the Point class.
	// Make it return a string in the following format.
	// For example, if a Point object stored in a
	// variable pt represents the point (5, -17),
	// return the string:
	// x.toString() x
	// Point(x=5,y=-17)
	// If the client code were to call System.out.println(pt); ,
	// that text would be shown on the console.
	
	public String toString() {
		return String.format("Point(x=%d,y=%d)", x, y);
	}
	
	// finally add a midpoint method
	
	public Point midpoint(Point p) {
		return new Point((p.x + x)/2, (p.y + y)/2);
	}
	
}
