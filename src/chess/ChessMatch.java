package chess;

import bordgame.Board;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	private Board board;
	
	
	// Constructors
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
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
	
	// Inicia as peças na posição do Xadrez
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPostion());
	}
	
	// Inicia a partida colocando as peças no tabuleiro
	private void initialSetup() {
		placeNewPiece('a', 1, new Rook(board, Color.WHITE));
		placeNewPiece('e', 1, new King(board, Color.WHITE));

		placeNewPiece('e', 8, new King(board, Color.BLACK));
	}
}
