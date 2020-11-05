package laboop1;
import java.util.Scanner;

public class Analyzer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Data date = new Data();
		String s;
		boolean good = true;
		while(good) {
			System.out.println("Enter number(Q to quit): ");
			s = in.nextLine();
			if(s.equals("Q"))
				break;
			else {
				date.getData(Integer.parseInt(s));
			}
		}System.out.println("maximum: " + date.getMaximum());
		System.out.println("average: " + date.getAverage());
	}

}
