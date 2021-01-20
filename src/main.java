class Connect4 {
	public static void main(String args[]) {
		Board board = new Board();
		board.addPiece(3, 1);
		board.addPiece(4, 2);
		board.render();
	}
}