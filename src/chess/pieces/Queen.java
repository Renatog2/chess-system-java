package chess.pieces;

import bordgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Queen extends ChessPiece {
	// Constructors
	public Queen(Board board, Color color) {
		super(board, color);
	}
	
	
	// Methods
	@Override
	public String toString() {
		return "Q";
	}
}
