import static org.junit.Assert.*;
import org.junit.Test;

public class BoardTest {
	@Test
	public void addPieceToEmptyColumn() throws Exception {
		Board board = new Board();
		board.addPiece(3, 1);
		int[][] pieces = board.getPieces();
		int[][] expectedPieces = {
									{0, 0, 0, 0, 0, 0},
									{0, 0, 0, 0, 0, 0},
									{0, 0, 0, 0, 0, 0},
									{1, 0, 0, 0, 0, 0},
									{0, 0, 0, 0, 0, 0},
									{0, 0, 0, 0, 0, 0},
									{0, 0, 0, 0, 0, 0}
		};
		assertArrayEquals(pieces, expectedPieces);
	}
	
	@Test
	public void addPieceToNonEmptyColumn() throws Exception {
		Board board = new Board();
		board.addPiece(3, 1);
		board.addPiece(3, 2);
		int[][] pieces = board.getPieces();
		int[][] expectedPieces = {
									{0, 0, 0, 0, 0, 0},
									{0, 0, 0, 0, 0, 0},
									{0, 0, 0, 0, 0, 0},
									{1, 2, 0, 0, 0, 0},
									{0, 0, 0, 0, 0, 0},
									{0, 0, 0, 0, 0, 0},
									{0, 0, 0, 0, 0, 0}
		};
		assertArrayEquals(pieces, expectedPieces);
	}
	
	@Test
	public void addPieceToFullColumn() throws Exception {
		Board board = new Board();
		board.addPiece(3, 1);
		board.addPiece(3, 2);
		board.addPiece(3, 1);
		board.addPiece(3, 2);
		board.addPiece(3, 1);
		board.addPiece(3, 2);
		
		Exception exception = assertThrows(Exception.class, () -> {
			board.addPiece(3, 1);
	    });

	    String expectedMessage = "Column is full";
	    String actualMessage = exception.getMessage();

	    assertTrue(actualMessage.contains(expectedMessage));
	}
}
