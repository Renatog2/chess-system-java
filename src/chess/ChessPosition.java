package chess;

import bordgame.Position;

public class ChessPosition {
	private char column;
	private int row;
	
	
	// Constructors
	public ChessPosition(char column, int row) {
		// Impedir posição fora do tabuleiro
		if(column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8");
		}
		
		this.column = column;
		this.row = row;
	}
	
	
	//Getters and Setters
	public char getColumn() {
		return column;
	}
	public int getRow() {
		return row;
	}
	
	
	// Methods
	protected Position toPostion() {
		return new Position(8 - row, column - 'a');
	}
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
	}
	
	@Override
	public String toString() {
		return "" + column + row;
	}
}
