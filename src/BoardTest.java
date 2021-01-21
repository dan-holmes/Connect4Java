import static org.junit.Assert.*;
import org.junit.Test;

public class BoardTest {
	@Test
	public void testAddPiece() {
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

}
