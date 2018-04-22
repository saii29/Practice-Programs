package com.assignment.snakeladder;

import java.util.ArrayList;

public class Game implements Runnable {

	private Board board;
	private Dice dice;
	private ArrayList<Player> players = new ArrayList<>();
	private int round;
	private int curPos;
	private Integer prevPos;

	public Game(Board board, Dice dice) {
		this.board = board;
		this.dice = dice;
	}

	public void createPlayers(int players) {
		for (int i = 0; i < players; i++) {
			this.players.add(new Player("user" + i, dice));
			this.players.get(i).getPositions().add(0);
		}
	}

	@Override
	public void run() {

		int teamSize = players.size();
		boolean flag = true;

		while (flag) {
			round++;
			for (int i = 0; i < teamSize; i++) {
				try {
					int move = players.get(i).call();
					prevPos = players.get(i).getPositions().get(round - 1);
					curPos = prevPos + move;
					if (curPos > 100) {
						curPos = curPos - move;
					}
					players.get(i).getPositions().add(curPos);
					if (curPos == 100) {
						flag = false;
						System.out.println(
								players.get(i).getName() + " " + round + " " + prevPos + " " + curPos + " END ");
						System.out.println("Winner: " + players.get(i).getName());
						break;
					}
					// System.out.println(board.getSnakeMap().containsKey(curPos));
					if (board.getSnakeMap().containsKey(curPos)) {
						System.out.print(" snake  ");
						curPos = board.getSnakeMap().get(curPos);
						players.get(i).getPositions().set(round, curPos);
					} else if (board.getLadderMap().containsKey(curPos)) {
						System.out.print(" ladder ");
						curPos = board.getLadderMap().get(curPos);
						players.get(i).getPositions().set(round, curPos);
					}
					System.out.print(players.get(i).getName() + " " + round + " " + prevPos + " " + curPos + " ");
					if (i == 1) {
						System.out.println("");
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

	}

}
