import java.util.*;

public class Chicken extends Actor {

	Chicken() {
		Random rand = new Random();
		currCol = rand.nextInt(9) + 1;
		currRow = rand.nextInt(9) + 1;
		border = false;
	}

	void move(boolean borderCheck) {
		Random rand = new Random();
		int movement = 0;
		movement = rand.nextInt(4) + 1;

		if (movement == 1) {// up
			if (borderCheck == false)
				currRow--;
			else {
				if (currRow == 1)
					currRow = 1;
				else
					currRow--;
			}
		} else if (movement == 2) {// left
			if (borderCheck == false)
				currCol--;
			else {
				if (currCol == 1)
					currCol = 1;
				else
					currCol--;
			}
		} else if (movement == 3) {// down
			if (borderCheck == false)
				currRow++;
			else {
				if (currRow == 9)
					currRow = 9;
				else
					currRow++;
			}
		} else if (movement == 4) {// right
			if (borderCheck == false)
				currCol++;
			else {
				if (currCol == 9)
					currCol = 9;
				else
					currCol++;
			}
		} else
			System.out.println("Error");
	}

	@Override
	void move() {
		// TODO Auto-generated method stub

	}
	public void setPosition(int x, int y)
	{
		currRow = x;
		currCol = y;
	}
	public int getColumn()
	{
		return currCol;
	}
	public int getRow()
	{
		return currRow;
	}

}
