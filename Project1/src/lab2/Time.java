package lab2;
import java.util.Scanner;

public class Time {
	public static int hour,minute,second;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int hour,minute,second;
		hour = in.nextInt();
		minute = in.nextInt();
		second = in.nextInt();
		Time t = new Time(hour,minute,second);
		System.out.println(t.toUniversal());
		System.out.println(t.toStandard());
		//Time t2 = new Time(hour,minute,second);
		//System.out.println(t2.toUniversal());
		//System.out.println(t2.toStandard());
		//t.add(t2);
	}
	public Time(int hour,int minute ,int second) {
		if(hour>=24 || hour<=0 || minute >= 60 || minute <= 0 || second >= 60 || second <= 0) {
			System.out.println("invalid input");
			System.exit(0);
		}
		else{
			this.hour = hour;
			this.minute = minute;
			this.second = second;
			}
	}

	public String toUniversal() {
		String res ="";
		if (hour<10) 
			res+= "0"+hour+":";
		if(hour>=10)
			res+=hour+":";
		if (minute<10) 
			res+="0"+minute+":";
		if(minute>=10)
			res+=minute+":";
		if (second<10) 
			res+="0"+second;
		if(second>=10)
			res+=second;
		return res;
		}
	
	public String toStandard() {
		String res1="";
		if(hour > 12) {
			hour-=12;
		}
		if (hour<10) 
			res1+= "0"+hour+":";
		if(hour>=10)
			res1+=hour+":";
		if (minute<10) 
			res1+="0"+minute+":";
		if(minute>=10)
			res1+=minute+":";
		if (second<10) 
			res1+="0"+second+" PM";
		if(second>=10)
			res1+=second+" PM";
		return res1;
	}
}
