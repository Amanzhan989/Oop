package laboop2task3;

abstract class Piece {
	int position_x1,position_y1,position_x2,position_y2;
	public Piece() {}
	
	public Piece(int position_x1,int position_y1,int position_x2,int position_y2) {
		this.position_x1 = position_x1;
		this.position_y1 = position_y1;
		this.position_x2 = position_x2;
		this.position_y2 = position_y2;
	}
	abstract boolean isLegalMove();
	abstract void answer();	

}
