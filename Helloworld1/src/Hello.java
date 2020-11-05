import java.util.*;
public class Hello {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		double r = Math.sqrt(a*a+b*b);
		double answer = r*r*Math.PI;
		System.out.println(answer);
		
	}
}
