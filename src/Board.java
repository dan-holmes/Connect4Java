
public class Board {
	private static final int COLUMNS = 7;
	private static final int ROWS = 6;
	
	int[][] pieces;
	
	public Board() {
		pieces = new int[7][6];
	}
	
	public void addPiece(int column, int player) throws Exception {
		for(int row = 0; row < pieces[column].length; row++) {
			if(pieces[column][row] == 0) {
				pieces[column][row] = player;
				return;
			}
		}
		throw new Exception("Column is full");
	}
	
	public int[][] getPieces() {
		return pieces;
	}
	
	public void render() {
		for(int j = 0; j < ROWS; j++) {
			for(int i = 0; i < COLUMNS; i++) {
				int row = ROWS - 1 - j ;
				int column = i;
				System.out.print(pieces[column][row]);
			}
			System.out.print("\n");
		}
	}
}
