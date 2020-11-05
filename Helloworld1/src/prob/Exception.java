package prob;

public class Exception{
	 public static void main(String[] args){
	 int     denominator, numerator, ratio;

	 
	 numerator   = 5;
	 denominator = 0;
	 try {
	    ratio = numerator / denominator;
	 System.out.println("The answer is: "+ratio);

	 System.out.println("Done."); // Don't move this line
	    
	 }
	 catch(Exception e) {
		 System.out.println("Divide by 0."); 
		 e.printStackTrace();
	    }
	 }
}
