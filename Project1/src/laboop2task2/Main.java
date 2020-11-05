package laboop2task2;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int salary = in.nextInt();
		int workExperience = in.nextInt();

		Specialty doc = new Doctor(salary,workExperience,Gender.FEMALE,Country.KAZAKHSTAN);
		Specialty pro = new Programmer(salary,workExperience,Gender.MALE,Country.ABROAD);	
		HashSet <Specialty> spe = new HashSet<Specialty>();
		spe.add(doc);
		spe.add(pro);
		
		System.out.println(doc.equals(pro));
		System.out.println(doc.toString());
		System.out.println(pro.toString());
		
		
	}

}
