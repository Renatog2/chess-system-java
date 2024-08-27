package chess;

import bordgame.Board;

public class ChessMatch {
	private Board board;
	
	
	// Constructors
	public ChessMatch() {
		super();
		board = new Board(8, 8);
	}
	
	
	// Methods
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		
		for(int i=0; i<board.getRows(); i++) {
			for(int n=0; n<board.getColumns(); n++) {
				// Aqui é feito um Downcasting para a peça ser identificada como uma peça de Xadrez
				mat[i][n] = (ChessPiece) board.piece(i, n);
			}
		}
		
		return mat;
	}
}
