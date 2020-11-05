package laboop2task5;

public class Main {
	Circuit a = new Resistor(3.0);
	Circuit b = new Resistor(3.0);
	Circuit c = new Resistor(6.0);
	Circuit d = new Resistor(3.0);
	Circuit e = new Resistor(3.0);
	Circuit f = new Series(a,b);
	Circuit g = new Parallel(c,d);
	Circuit h = new Series(g,e);
	Circuit circ = new Parallel(h,f);
	double R = circ.getResistance();
	
	public Main() {};
	public static void main(String[] args) {
		Main mn = new Main();
		System.out.println(mn.R);
		
	}

}
