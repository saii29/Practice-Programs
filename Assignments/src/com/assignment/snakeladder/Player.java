package com.assignment.snakeladder;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class Player implements Callable<Integer> {

	private String name;
	private ArrayList<Integer> positions = new ArrayList<>();
	private static Dice dice;

	public Player(String name, Dice dice) {
		this.name = name;
		Player.dice = dice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Integer> getPositions() {
		return positions;
	}

	public void setPositions(ArrayList<Integer> positions) {
		this.positions = positions;
	}

	public static Dice getDice() {
		return dice;
	}

	public static void setDice(Dice dice) {
		Player.dice = dice;
	}

	@Override
	public Integer call() throws Exception {
		int move = dice.rollTheDice();
		System.out.print("move:" + move + " ");
		return move;
	}

}
