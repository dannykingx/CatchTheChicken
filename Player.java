
public class Player extends Actor {
	public Player() {
		currCol = 4;
		currRow = 5;
		border = false;
	}

	void move(String movement, boolean borderCheck)// I don't like using switch
	{
		if (movement == "w") {// up
			if (borderCheck == false)
				currRow--;
			else {
				if (currRow == 1)
					currRow = 1;
				else
					currRow--;
			}
		} else if (movement == "a") {// left
			if (borderCheck == false)
				currCol--;
			else {
				if (currCol == 1)
					currCol = 1;
				else
					currCol--;
			}
		} else if (movement == "s") {// down
			if (borderCheck == false)
				currRow++;
			else {
				if (currRow == 9)
					currRow = 9;
				else
					currRow++;
			}
		} else if (movement == "d") {// right
			if (borderCheck == false)
				currCol++;
			else {
				if (currCol == 9)
					currCol = 9;
				else
					currCol++;
			}
		}

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
