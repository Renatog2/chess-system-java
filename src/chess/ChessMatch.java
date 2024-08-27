package chess;

import bordgame.Board;
import bordgame.Position;
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
	
	// Inicia a partida colocando as peças no tabuleiro
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(7, 0));
		board.placePiece(new King(board, Color.WHITE), new Position(7, 4));

		board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
	}
}
