package prob;

public class Triangle extends Shape {
	public Triangle(Colour color,int x) {
		super(color,x);
	}
	
	double a = 3,b = 4,c = 5;
	public double Geron(double a,double b,double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		double p = (a+b+c)/2;
		double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return area;
	}
	void draw() {
		if(color == color.RED) {
			int x = 0;
			for(int i = 0; i < x;i++) {
				System.out.println(" ");
				System.out.println("<|");
			}
		}
		if(color == color.BLACK) {
			int x = 0;
			for(int i = 0; i < x;i++) {
				System.out.println(" ");
				System.out.println("<|");
			}
		}
	}
}

