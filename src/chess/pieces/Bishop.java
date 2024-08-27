package chess.pieces;

import bordgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Bishop extends ChessPiece {
	// Constructors
	public Bishop(Board board, Color color) {
		super(board, color);
	}
	
	
	// Methods
	@Override
	public String toString() {
		return "B";
	}
}
