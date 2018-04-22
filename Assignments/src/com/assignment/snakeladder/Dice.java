package com.assignment.snakeladder;

import java.util.Random;

public class Dice {

	private static final int sides = 6;

	public static int getSides() {
		return sides;
	}

	// Considering from 0 to a fixed number.
	public static int rollTheDice() {
		return new Random().nextInt(sides) + 1;
	}

}
