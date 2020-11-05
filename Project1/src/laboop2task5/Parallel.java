package laboop2task5;

public class Parallel extends Circuit {
	Circuit a;
	Circuit b;
	public double V;
	public Parallel(Circuit a,Circuit b) {
		this.a = a;
		this.b = b;
	}
	
	public double getPotentialDiff() {
		return b.getPotentialDiff();
	}
	public double getResistance() {
		double resis = (a.getResistance()*b.getResistance())/(a.getResistance()+b.getResistance());
		return resis;
	}
	public void applyPotentialDiff(double v) {
		this.V = v;
	}
}
