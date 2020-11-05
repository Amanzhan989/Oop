package laboop2;

public class Sphere extends Shape{
	int radius ;
	public Sphere() {};
	
	public Sphere(int radius) {
		this.radius = radius;
	}
	public double volume() {
		return 4/3*Math.PI*radius*radius*radius;
	}
	public double surfaceArea() {
		return 4*Math.PI*radius*radius;
	}
	public double lateralSurfaceArea() {
		return Math.PI*radius*radius;
	}
	
}
