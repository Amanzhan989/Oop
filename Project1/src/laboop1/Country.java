package laboop1;

public class Country {
	final String independentDay = "16 December 1991year";
	int numOfCities = 16;
	enum Cities{
		Almaty,NurSultan,Aktay,Aktobe,Oral,Shymkent,Kostanay;
	}
	
	public Country() {};
	
	private int oldOfCountry = 0;
	{
		oldOfCountry++;
	}
	
	public Country(int numOfCities) {
		this.numOfCities = numOfCities;
	}
	
	public int getNumOfCities() {
		return numOfCities;
	}
	
	public int setNumOfCities() {
		return ++numOfCities;
	}

	static void welcome() {
		System.out.println("Welcome to Kazakhstan!!!");
	}
	
	public void gives(String s1) {
		System.out.println(s1);
	}
	public void gives(int number,String s2) {
		System.out.println(number+s2);
	}
	
}
