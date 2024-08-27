package chess.pieces;

import bordgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Pawn extends ChessPiece {
	// Constructors
	public Pawn(Board board, Color color) {
		super(board, color);
	}
	
	
	// Methods
	@Override
	public String toString() {
		return "P";
	}
}
