package lab1;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a,b,c;
		double x1,x2;
		int d;
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		d = b*b-4*a*c;
		if (Math.sqrt(d)<0) {
			System.out.println("ERROR");
		}
		if (Math.sqrt(d)==0) {
			x1 = -b/2*a; 
			System.out.println(x1);
		}
		else {
			x1 = (-b+Math.sqrt(d))/2;
			x2 = (-b-Math.sqrt(d))/2;
			System.out.println(x1+"\n"+x2);
		}
	}

}
