package podg1;

public class Building {
	private int numberOfFloors;
	public double	floorArea;
	
	public Building(int numberOfFloors,double floorArea) {
		this.floorArea = floorArea;
		this.numberOfFloors = numberOfFloors;
	}
	
	public int getNumberOfFloors() {
		return numberOfFloors;
	}
	
}
