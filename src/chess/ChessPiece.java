package chess;

import bordgame.Board;
import bordgame.Piece;

public class ChessPiece extends Piece {
	private Color color;
	
	
	// Constructor
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}
	
	
	// Getters and Setters
	public Color getColor() {
		return color;
	}
}
