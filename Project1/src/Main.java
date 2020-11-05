import java.util.Scanner;

public class Main {
	static int getSum(int []a) {
		int res = 0;
		for(int i = 0;i<a.length;i++) {
			res+=a[i];
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num1,num2;
		//num1 = in.nextInt();
		//num2 = in.nextInt();
		//double sum = Math.pow(num1,num2);	
		int a[] = new int[5];
		for(int i = 0; i < 5 ;i++) {
			a[i] = in.nextInt();
		}
		System.out.println(getSum(a));

	}
	
}
