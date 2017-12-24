// Group Members:
// Danny King
// Thi Tran

import java.io.*;
import java.util.*;

public class RPG {
	private static Chicken chasee = new Chicken();
	private static Player chaser = new Player();
	private static Map rpgMap = new Map();

	public static void main(String args[]) {
		Scanner kbReader = new Scanner(System.in);

		rpgMap.printMap();
		System.out.println("Spawning Chicken and Player: Player, Chase the Chicken!");
		String input = "";
		rpgMap.updateMap(chasee.getRow(), chasee.getColumn(), chaser.getRow(), chaser.getColumn());
		rpgMap.printMap();
		while (input != "q") {

			System.out.println("What is your next move, Player?");
			input = kbReader.nextLine();
			if (chasee.getRow() == chaser.getRow() && chasee.getColumn() == chaser.getColumn()) {
				input = "q";
			} else {
				chaser.move(input, false);
				chasee.move(false);
				rpgMap.updateMap(chasee.getRow(), chasee.getColumn(), chaser.getRow(), chaser.getColumn());
				rpgMap.printMap();
			}

		}
	}
}
