
public class Map {
	
	char[][] map = new char[9][9];
	Map() {
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++)
				map[i][j] = '-';
		}
	}

	void updateMap(int row1, int col1, int row2, int col2) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++)
			{
				map[i][j] = '-';
			}
		}
			map[row1][col1] = 'C';
			map[row2][col2] = 'P';
		
	}

	void printMap() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++)
			{
				System.out.print(map[i][j]);
			}
			System.out.print("\n");
		}
		
	}

}
