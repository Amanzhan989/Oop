package lec7;

import java.io.Serializable;
import java.util.Date;
 
public class Book implements Serializable{
		String author;
		String title;
		Date published;
		
		public Book() {}
		public Book(String author,String title) {
			this.author = author;
			this.title  = title;
			published = new Date();
		}
		public String toString() {
			return "Author: "+ author+" ,title "+title+" "+published;
		}
		
	}


