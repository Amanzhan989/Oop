package lab2;

import java.util.Scanner;

public class StarTriangle {
	public static int width;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		width = in.nextInt();
		StarTriangle st = new StarTriangle(width);
		System.out.println(st.toString());
	}
	StarTriangle(int width){
		this.width = width;
	}
	public String toString(){
		String res = "";
		for(int i = 1; i <= width;i++) {
			for(int j = 0;j < i;j++) {
				res+="[*]";
			}res+="\n";
		}
		return res;
	}

}
