package lab1;
import java.util.Scanner;
public class Problem6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		boolean ok = true;
		
		for(int i = 0;i<s.length();i++) {
			int n;
			n = s.length()-i-1;
			if(s.charAt(i)!=s.charAt(n)) {
				System.out.println("not palindrome");
				ok = false;
				break;
			}
			else {
				ok = true;
			}
			
		}
		if(ok==true) {
			System.out.println("palindrome");
		}
	}
}
