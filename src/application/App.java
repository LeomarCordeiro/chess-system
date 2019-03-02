package application;


import chess.ChessMatch;

public class App {

	public static void main(String[] args) {
		ChessMatch chessMath = new ChessMatch(); 
		UI.printBoard(chessMath.getPieces()); 

	}

}
