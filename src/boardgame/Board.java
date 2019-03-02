package boardgame;

public class Board {
	private Integer rows;
	private Integer colluns;
	private Piece[][] pieces;

	public Board(Integer rows, Integer colluns) {
		if (rows < 1 || colluns < 1) {
			throw new BoardException("Error creating board: there must be at last 1 row and 1 collum.");
		}

		this.rows = rows;
		this.colluns = colluns;
		pieces = new Piece[rows][colluns];
	}

	public Integer getRows() {
		return rows;
	}

	public Integer getColluns() {
		return colluns;
	}

	public Piece piece(int row, int collumn) {
		if (!positionExists(row, collumn)) {
			throw new BoardException("Position not on the board");
		}
		return pieces[row][collumn];
	}

	public Piece piece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}

		return pieces[position.getRow()][position.getCollum()];
	}

	public void placePiece(Piece piece, Position position) {

		if (thereIsAPiece(position)) {
			throw new BoardException("There is alreade a piece on position" + position);
		}

		pieces[position.getRow()][position.getCollum()] = piece;
		piece.position = position;
	}

	private boolean positionExists(int row, int collumn) {

		return (row >= 0 && row < rows) && (collumn >= 0 && collumn < colluns);
	}

	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getCollum());
	}

	public boolean thereIsAPiece(Position position) {

		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}

		return piece(position) != null;
	}

}
