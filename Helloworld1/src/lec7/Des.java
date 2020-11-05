package lec7;
import java.io.*;
public class Des {
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("books.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Book b = (Book)ois.readObject();
		System.out.println(b);
	}
}
