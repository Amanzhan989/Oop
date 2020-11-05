package laboop2task3;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		char ch1 = in.next().charAt(0);
		int position_x1 = 0;
		
		if(ch1=='A')
			position_x1 = 1;
		if(ch1=='B')
			position_x1 = 2;
		if(ch1=='C')
			position_x1 = 3;
		if(ch1=='D')
			position_x1 = 4;
		if(ch1=='E')
			position_x1 = 5;
		if(ch1=='F')
			position_x1 = 6;
		if(ch1=='G')
			position_x1 = 7;
		if(ch1=='H')
			position_x1 = 8;
		
		int position_y1 = in.nextInt();
		char ch2 = in.next().charAt(0);
		
		int position_x2 = 0;
		
		if(ch2=='A')
			position_x2 = 1;
		if(ch2=='B')
			position_x2 = 2;
		if(ch2=='C')
			position_x2 = 3;
		if(ch2=='D')
			position_x2 = 4;
		if(ch2=='E')
			position_x2 = 5;
		if(ch2=='F')
			position_x2 = 6;
		if(ch2=='G')
			position_x2 = 7;
		if(ch2=='H')
			position_x2 = 8;

		
		int position_y2 = in.nextInt();
		
		Piece paw = new Pawn(position_x1,position_y1,position_x2,position_y2);
		Piece bis = new Bishop(position_x1,position_y1,position_x2,position_y2);
		Piece kni = new Knight(position_x1,position_y1,position_x2,position_y2);
		Piece roc = new Rock(position_x1,position_y1,position_x2,position_y2);
		Piece que = new Queen(position_x1,position_y1,position_x2,position_y2);
		Piece kin = new King(position_x1,position_y1,position_x2,position_y2);
		if(position_x1==position_x2 && position_y1==position_y2)
			System.out.println("It is same positions error");
		else if(position_x1 <= 8 && position_x1 > 0 && position_y1<=8 && position_y1 > 0 && position_x2<=8 && position_x2 > 0 && position_y2<=8 && position_y2 > 0) {
			paw.answer();
			bis.answer();
			kni.answer();
			roc.answer();
			que.answer();
			kin.answer();
		}
		else
			System.out.println("Invalid input");
	}
	
}
