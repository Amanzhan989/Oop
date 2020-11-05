package laboop2;

public class Cylinder extends Shape {
	int radius;
	int height;
	
	public Cylinder() {};
	
	public Cylinder(int radius,int height) {
		this.radius = radius;
		this.height = height;
	}
	
	public double volume() {
		return Math.PI*radius*radius*height;
	}
	public double surfaceArea() {
		return 2*Math.PI*radius*radius + 2*Math.PI*height;
	}
	public double lateralSurfaceArea() {
		return 2*Math.PI*height;
	}
	

}
