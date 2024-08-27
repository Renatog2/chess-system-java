package chess.pieces;

import bordgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece{
	// Constructors
	public Rook(Board board, Color color) {
		super(board, color);
	}
	
	
	// Methods
	@Override
	public String toString() {
		return "R";
	}
}
