import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrinterTest {
	@Test
	void printsBoard() throws Exception {
		Board board = new Board();
		board.addPiece(3, 1);
		board.addPiece(4, 2);
		String output = Printer.printBoard(board);
		String expectedOutput = "0000000\n"
				+ "0000000\n"
				+ "0000000\n"
				+ "0000000\n"
				+ "0000000\n"
				+ "0001200\n";
		assertEquals(output, expectedOutput);
	}
}
