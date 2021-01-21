
public class Printer {
	static String printBoard(Board board) {
		String output = "";
		for(int j = 0; j < Board.ROWS; j++) {
			for(int i = 0; i < Board.COLUMNS; i++) {
				int row = Board.ROWS - 1 - j ;
				int column = i;
				output += board.getPieces()[column][row];
			}
			output += "\n";
		}
		return output;
	}
}
