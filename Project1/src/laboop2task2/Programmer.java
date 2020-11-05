package laboop2task2;

public class Programmer extends Specialty{

	public Programmer(int salary,int workExperience,Gender gendr,Country contry) {
		super(salary,workExperience,gendr,contry);
	}

		
	public int hashCode() {
		return super.hashCode();
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}
	public Gender getGender(Gender gendr) {
		return gendr;
	}
	public Country getCountry(Country contry) {
		return contry;
	}
	public String toString() {
		return "Programmer gender is "+gendr+", Workplace in "+contry;
	}
	/*public void setProgrammer(Specialty pro) {
		pro = new Programmer(salary,workExperience,Gender.FEMALE,Country.KAZAKHSTAN);
	}

	*/
	
	
}

