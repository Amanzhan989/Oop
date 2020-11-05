package lab2;
import java.util.Scanner;

public class Student {

	public static String name = "<unnamed>";
	private static int idNum;
	private static int yearOfStudy;
	
	Student(){
		yearOfStudy++;
	}
	
	Student(String StudentName, int idNum) {
		name = StudentName;
		this.idNum = idNum;
		
	}
}






