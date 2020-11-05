package laboop2task3;

public class Pawn extends Piece{
	
	public Pawn(int position_x1,int position_y1,int position_x2,int position_y2) {
		super(position_x1,position_y1,position_x2,position_y2);
	}
	
	
	boolean isLegalMove() {
		boolean check = false;
		if((position_y2 - position_y1 == 1) && (position_x2 == position_x1)) 
				check = true;
		
		return check;
	}
	void answer() {
		if(isLegalMove())
			System.out.println("For pawn is legal");
		else
			System.out.println("For pawn is not legal");
	}
}

