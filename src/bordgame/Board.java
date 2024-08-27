package bordgame;

public class Board {
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	
	// Constructors
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}
	
	
	// Getters and Setters
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	
	public int getColumns() {
		return columns;
	}
	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	
	// Methods
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	
	// Retorna a peça pela classe Position
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	
	// Implementa a posição da peça
	public void placePiece(Piece piece, Position position) {
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
}
