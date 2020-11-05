package laboop2task2;

public class Doctor extends Specialty {
	public Doctor(int salary,int workExperience,Gender gendr,Country contry) {
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
	public int getSalary(int salary) {
		return salary;
	}
	public int getWorkExperience(int workExperience) {
		return workExperience;
	}
	
	public String toString() {
		return "Doctors salary is "+super.toString();
	}
}
