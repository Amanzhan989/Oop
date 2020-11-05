package lab1;
import java.util.Scanner;
public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a;
		a = in.nextInt();	
		if (a>100 || a<0) {
			System.out.println("Please input other number");
		}
		if (a>=95 && a<=100) {
			System.out.println("A");
		}
		else if (a<95 && a>=90) {
			System.out.println("A-");
		}
		else if (a<90 && a>=85) {
			System.out.println("B");
		}
		else if (a<85 && a>=80) {
			System.out.println("B-");
		}
		else if (a<80 && a>=75) {
			System.out.println("C");
		}
		else if (a<75 && a>=70) {
			System.out.println("C");
		}
		else if (a<70 && a>=65) {
			System.out.println("D");
		}
		else if (a<65 && a>=50) {
			System.out.println("D-");
		}
		else if (a<50 && a>=0) {
			System.out.println("F");
		}
		
	}

}
