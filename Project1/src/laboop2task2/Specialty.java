package laboop2task2;

public class Specialty {
	public int salary;
	public int workExperience;
	Gender gendr;
	Country contry;
	public Specialty() {};
	
	public Specialty(int salary,int workExperience,Gender gendr,Country contry) {
		this.salary = salary;
		this.workExperience = workExperience;
		this.gendr  = gendr;
		this.contry = contry;
	}

	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contry == null) ? 0 : contry.hashCode());
		result = prime * result + ((gendr == null) ? 0 : gendr.hashCode());
		result = prime * result + salary;
		result = prime * result + workExperience;
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Specialty other = (Specialty) obj;
		if (contry != other.contry)
			return false;
		if (gendr != other.gendr)
			return false;
		if (salary != other.salary)
			return false;
		if (workExperience != other.workExperience)
			return false;
		return true;
	}
	public String toString() {
		return "Salary "+salary+" workExperience "+workExperience;
	}

}
