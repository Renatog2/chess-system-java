package chess.pieces;

import bordgame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece{
	// Constructors
	public King(Board board, Color color) {
		super(board, color);
	}
	
	
	// Methods
	@Override
	public String toString() {
		return "K";
	}
}
