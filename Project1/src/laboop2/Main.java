package laboop2;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int radius = in.nextInt();
		int height = in.nextInt();
		int a = in.nextInt();
		Vector <Shape> sh = new Vector<Shape>();
		Shape cyl = new Cylinder(radius,height);
		Shape cub = new Cube(a);
		Shape sph = new Sphere(radius);
		sh.add(cyl);
		sh.add(cub);
		sh.add(sph);
		
		for(Shape i:sh) {
			i.volume();
			i.surfaceArea();
			System.out.println("Volume "+i.volume());
			System.out.println("Surface area "+i.surfaceArea());
			System.out.println("Lateralsurface area "+i.lateralSurfaceArea());
			
		}
	}

}
