package prob;

abstract class Shape {
	Colour color;
	int x;

	public Shape(Colour color,int x) {
		this.color = color;
		this.x = x;
	}
	abstract void draw();
}

