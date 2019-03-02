package boardgame;

public class Board {
	private Integer rows;
	private Integer colluns;
	private Piece[][] pieces;

	public Board(Integer rows, Integer colluns) {
		this.rows = rows;
		this.colluns = colluns;
		pieces = new Piece[rows][colluns];
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getColluns() {
		return colluns;
	}

	public void setColluns(Integer colluns) {
		this.colluns = colluns;
	}

	public Piece piece(int rows, int colluns) {
		return pieces[rows][colluns];
	}

	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getCollum()];
	}
	public void placePiece (Piece piece, Position position) {
		pieces [position.getRow()][position.getCollum()] = piece;  
		piece.position = position; 
	}

}
