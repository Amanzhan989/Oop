package laboop2task3;

public class Rock extends Piece {
	public Rock(int position_x1,int position_y1,int position_x2,int position_y2) {
		super(position_x1,position_y1,position_x2,position_y2);
	}

	public Rock() {
		super();
	}
	
	boolean isLegalMove(){
		boolean check = false;
		if(position_x2 == position_x1 || position_y2 == position_y1) 
			check = true;

		return check;
	}
	void answer() {
		if(isLegalMove())
			System.out.println("For rock is legal");
		else
			System.out.println("For rock is not legal");
	}
}
