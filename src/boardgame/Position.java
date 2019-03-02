package boardgame;

public class Position {
	
	private Integer row;
	private Integer collum;
	public Position(Integer row, Integer collum) {
		this.row = row;
		this.collum = collum;
	}
	public Integer getRow() {
		return row;
	}
	public void setRow(Integer row) {
		this.row = row;
	}
	public Integer getCollum() {
		return collum;
	}
	public void setCollum(Integer collum) {
		this.collum = collum;
	}
	
	@Override
	public String toString() {
		return 	row 
				+ ", " 
				+ collum; 
	}

}
