package SnakeAndLadders;

import java.util.HashMap;

public class SnakesLadders {

	public final String lose = "Game over!";
	public int pos1;
	public int pos2;
	public int turn;
	public boolean won;
	public HashMap<Integer, Integer> shortCut;

	public SnakesLadders() {
		pos1 = 0;
		pos2 = 0;
		turn = 1;
		won = false;
		shortCut = new HashMap<>();
		fillShortCut();
	}

	public String play(int die1, int die2) {
		if (won) {
			return lose;
		}

		move(die1 + die2);
		if (isOnSomething()) {
			moveTo(toWhere());
		}

		if (checkWin()) {
			won = true;
			String winner = "Player " + whoPlayer() + " Wins!";
			changeTurn();
			return winner;
		}
		String res = "Player " + whoPlayer() + " is on square " + playerPos();
		if (die1 != die2) {
			changeTurn();
		}

		return res;
	}

	public void fillShortCut() {
		shortCut.put(2, 38);
		shortCut.put(7, 14);
		shortCut.put(8, 31);
		shortCut.put(15, 26);
		shortCut.put(21, 42);
		shortCut.put(28, 84);
		shortCut.put(36, 44);
		shortCut.put(51, 67);
		shortCut.put(71, 91);
		shortCut.put(78, 98);
		shortCut.put(87, 94);
		shortCut.put(16, 6);
		shortCut.put(46, 25);
		shortCut.put(49, 11);
		shortCut.put(62, 19);
		shortCut.put(64, 60);
		shortCut.put(74, 53);
		shortCut.put(89, 68);
		shortCut.put(92, 88);
		shortCut.put(95, 75);
		shortCut.put(99, 80);
	}

	public void move(int moves) {
		if (turn == 1) {
			if (pos1 + moves > 100) {
				moveTo(100 - ((pos1 + moves) - 100));
			} else
				pos1 = pos1 + moves;
		} else {
			if (pos2 + moves > 100) {
				moveTo(100 - ((pos2 + moves) - 100));
			} else
				pos2 = pos2 + moves;
		}
	}

	public void moveTo(int pos) {
		if (turn == 1) {
			pos1 = pos;
		} else
			pos2 = pos;
	}

	public boolean isOnSomething() {
		if (turn == 1) {
			return (shortCut.containsKey(pos1));
		} else
			return (shortCut.containsKey(pos2));
	}

	public int toWhere() {
		if (turn == 1) {
			return (shortCut.get(Integer.valueOf(pos1)));
		} else
			return (shortCut.get(Integer.valueOf(pos2)));
	}

	public String whoPlayer() {

		if (turn == 1) {
			return "1";
		} else
			return "2";
	}

	public String playerPos() {
		if (turn == 1) {
			return String.valueOf(pos1);
		} else
			return String.valueOf(pos2);
	}

	public boolean checkWin() {
		if (turn == 1) {
			return pos1 == 100;
		} else
			return pos2 == 100;
	}

	public void changeTurn() {
		turn *= -1;
	}

	public static void main(String[] args) {
		SnakesLadders game = new SnakesLadders();

		System.out.println(game.play(1, 1));
		System.out.println(game.play(1, 5));
		System.out.println(game.play(6, 2));
		System.out.println(game.play(1, 1));
	}
}