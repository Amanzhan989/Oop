package laboop2task3;

public class Queen extends Piece {
	
	public Queen(int position_x1,int position_y1,int position_x2,int position_y2) {
		super(position_x1,position_y1,position_x2,position_y2);
	}

	public Piece rock = new Rock(this.position_x1,this.position_y1,this.position_x2,this.position_y2);
	public Piece bishop = new Bishop(this.position_x1,this.position_y1,this.position_x2,this.position_y2);
	
	boolean isLegalMove(){
		boolean check = false;
		if(rock.isLegalMove() || bishop.isLegalMove())
			check = true;

		return check;
	}
	void answer() {
		if(isLegalMove())
			System.out.println("For queen is legal");
		else
			System.out.println("For queen is not legal");
	}
}
