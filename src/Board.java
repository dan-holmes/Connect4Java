
public class Board {
	int[] pieces = {0, 0, 0, 0};
	
	public Board() {
		
	}
	
	public void render() {
		for(int i = 0; i < pieces.length; i++) {
			System.out.print(pieces[i]);
		}
	}
}
