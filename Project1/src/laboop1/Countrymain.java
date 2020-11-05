package laboop1;

import laboop1.Country.Cities;

public class Countrymain {

	public static void main(String[] args) {
		Country.Cities city = Country.Cities.Aktobe;
		System.out.println(city);
		Country.welcome();
		
		Country contry = new Country();
		
		contry.gives("Nursultan capital of KZ");
		contry.gives(1964," was created Aktobe");
		System.out.println(contry.getNumOfCities());
		System.out.println(contry.setNumOfCities());
	}

}
