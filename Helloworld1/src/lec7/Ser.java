package lec7;
import java.io.*;
public class Ser {

	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("books.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Book b = new Book("Fred","EXter....");
		oos.writeObject(b);
		oos.flush();
		oos.close();
				
	}

}
