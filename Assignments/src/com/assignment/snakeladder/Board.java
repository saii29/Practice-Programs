package com.assignment.snakeladder;

import java.util.HashMap;

public class Board {

	private HashMap<Integer, Integer> snakeMap = new HashMap<>();
	private HashMap<Integer, Integer> ladderMap = new HashMap<>();
	private int length;

	public Board(int length) {
		this.setLength(length);
	}

	public HashMap<Integer, Integer> getSnakeMap() {
		return snakeMap;
	}

	public void setSnakeMap(HashMap<Integer, Integer> snakeMap) {
		this.snakeMap = snakeMap;
	}

	public HashMap<Integer, Integer> getLadderMap() {
		return ladderMap;
	}

	public void setLadderMap(HashMap<Integer, Integer> ladderMap) {
		this.ladderMap = ladderMap;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

}
