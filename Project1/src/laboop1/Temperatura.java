package laboop1;

public class Temperatura {
	private double tempValue;
	private char tempScale;
	
	public Temperatura() {
		this.tempValue = 0;
		this.tempScale = 'C';
	}
	public Temperatura(char tempScale){
		this.tempScale = tempScale;
	}
	public Temperatura(double tempValue) {
		this.tempValue = tempValue;
	}
	public Temperatura(char tempScale, double tempValue) {
		this.tempScale = tempScale;
		this.tempValue = tempValue;
	}
	public double getValuesF() {
		if(this.tempScale=='C')
			return(9*(this.tempValue/5)+32);
		return this.tempValue;
	}
	public double getValuesC() {
		if(this.tempScale == 'F')
			return (5/9)*(this.tempValue-32);
		return this.tempValue;
	}
	public char getTempScale() {
		return this.tempScale;
	}
	public double getTempValue() {
		return this.tempValue;
	}
	public void setTempScale(char tempScale) {
		this.tempScale = tempScale;
	}
	public void setTempValue(double tempValue) {
		this.tempValue = tempValue;
	}
	public void setTempBoth(double tempValue,char tempScale) {
		this.tempScale = tempScale;
		this.tempValue = tempValue;
	}
}
