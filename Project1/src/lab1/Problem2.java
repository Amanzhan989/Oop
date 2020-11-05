package lab1;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		int area = a*a;
		int perimetr = 4*a;
		double diagonal = Math.sqrt(2)*a;
		String s = diagonal+"";
		System.out.println(area+"\n"+perimetr+"\n"+s);
	}

}
