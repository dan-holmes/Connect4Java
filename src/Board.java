
public class Board {
	private static final int COLUMNS = 7;
	private static final int ROWS = 6;
	
	int[][] pieces;
	
	public Board() {
		pieces = new int[7][6];
	}
	
	public void addPiece(int column, int player) {
		pieces[column][0] = player;
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
