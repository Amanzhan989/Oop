package laboop2task5;

public class Series extends Circuit{
	Circuit a;
	Circuit b;
	public double V;
	
	public Series(Circuit a,Circuit b) {
		this.a = a;
		this.b = b;
	}
	
	public double getResistance() {
		double series = a.getResistance() + b.getResistance();
		return series;
	}
	
	public double getPotentialDiff() {
		return a.getPotentialDiff() + b.getPotentialDiff();
	}
	
	public void applyPotentialDiff(double V) {
		this.V = V;
	}
}
