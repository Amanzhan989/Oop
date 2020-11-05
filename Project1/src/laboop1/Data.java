package laboop1;


public class Data {
	
	private double maximum;
	private double summa;
	private int counter;
	
	public Data() {
		this.maximum = -1000000000;
		this.summa =  0;
		this.counter = 0;
	}
	
	public void getData(int number) {
		if(maximum < number) {
			maximum = number;
			summa+=number;
			counter++;
		}
	}
	public double getAverage() {
		return summa/counter;
	}
	public double getMaximum() {
		return maximum;
	}
	public String toString() {
		return ""+summa/counter+" "+summa+" "+maximum;
	}
}