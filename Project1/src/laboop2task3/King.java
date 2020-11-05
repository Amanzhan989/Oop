package laboop2task3;
public class King extends Piece {
	public King(int position_x1,int position_y1,int position_x2,int position_y2) {
		super(position_x1,position_y1,position_x2,position_y2);
	}

	
	boolean isLegalMove(){
		boolean check = false;
		if((Math.abs(position_x2-position_x1)<=1) && (Math.abs(position_y2-position_y1)<=1))
				check = true;

		return check;
	}
	void answer() {
		if(isLegalMove())
			System.out.println("For king is legal");
		else
			System.out.println("For king is not legal");
	}
}
