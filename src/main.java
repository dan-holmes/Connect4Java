class Connect4 {
	public static void main(String args[]) {
		Board board = new Board();
		try {
			board.addPiece(3, 1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			board.addPiece(4, 2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		board.render();
	}
}