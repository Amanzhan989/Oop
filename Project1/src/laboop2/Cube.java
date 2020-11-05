package laboop2;

public class Cube extends Shape {
	int a;
	public Cube() {};
	
	public Cube(int a) {
		this.a = a;
	}
	public double volume() {
		return a*a*a;
	}
	public double surfaceArea() {
		return 6*a*a;
	}
	public double lateralSurfaceArea() {
		return 4*a*a;
	}
	
	
}
