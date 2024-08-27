package chess.pieces;

import bordgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Knight extends ChessPiece {
	// Constructors
	public Knight(Board board, Color color) {
		super(board, color);
	}
	
	
	// Methods
	@Override
	public String toString() {
		return "H";
	}
}
