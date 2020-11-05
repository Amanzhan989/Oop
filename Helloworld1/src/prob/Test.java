package prob;

import java.awt.Color;
import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		Vector <Shape> s = new Vector<Shape>();
		Shape t = new Triangle(Colour.BLACK,5);
		Shape c = new Circle(Colour.RED,6);
		s.add(t);
		s.add(c);
		for(Shape shape:s) {
			shape.draw();
		}
		

	}

}
