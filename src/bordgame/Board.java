package bordgame;

public class Board {
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	
	// Constructors
	public Board(int rows, int columns) {
		// Impedir a criação de tabuleiros zerados
		if (rows < 1 || columns < 1) {
			throw new BoardException("Error creating board: there must be at least 1 row and 1 column");
		}
		
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}
	
	
	// Getters and Setters
	public int getRows() {
		return rows;
	}
	
	public int getColumns() {
		return columns;
	}
	
	
	// Methods
	public Piece piece(int row, int column) {
		// Impedir caso a posição não exista no tabuleiro
		if(!positionExists(row, column)) {
			throw new BoardException("Position not on the board");
		}
		
		return pieces[row][column];
	}
	
	// Retorna a peça pela classe Position
	public Piece piece(Position position) {
		// Impedir caso a posição não exista no tabuleiro
		if(!positionExists(position.getRow(), position.getColumn())) {
			throw new BoardException("Position not on the board");
		}
		
		return pieces[position.getRow()][position.getColumn()];
	}
	
	// Implementa a posição da peça
	public void placePiece(Piece piece, Position position) {
		// Testar se não existe uma peça na posição
		if(thereIsAPiece(position)) {
			throw new BoardException("There is already a piece on position "+ position);
		}
		
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	public Piece removePiece(Position position) {
		// Impedir caso a posição não exista no tabuleiro
		if(!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		
		if (piece(position) == null) {
			return null;
		}
		
		Piece aux = piece(position);
		aux.position = null;
		pieces[position.getRow()][position.getColumn()] = null;
		return aux;
	}
	
	// Testar se a posição é valida para o movimento da peça
	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	
	// Testar se não existe uma peça na posição
	public boolean thereIsAPiece(Position position) {
		// Impedir caso a posição não exista no tabuleiro
		if(!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		
		return piece(position) != null;
	}
}
