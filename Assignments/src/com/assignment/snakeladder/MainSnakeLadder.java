package com.assignment.snakeladder;

import java.util.Scanner;

public class MainSnakeLadder {

	public static void main(String[] args) {

		System.out.println("Enter the input in pre-defined format only::");

		Scanner sc = new Scanner(System.in);
		int pitStops = sc.nextInt();
		sc.nextLine();

		/*
		 * Creating the board of length 100 and storing the snake and ladder
		 * details in respective maps
		 */
		Board board = new Board(100);
		for (int i = 0; i < pitStops; i++) {
			String[] input = sc.nextLine().split(" ");
			board.getSnakeMap().put(Integer.valueOf(input[1]), Integer.valueOf(input[0]));
			board.getLadderMap().put(Integer.valueOf(input[2]), Integer.valueOf(input[3]));
		}

		System.out.println("Snake Map: " + board.getSnakeMap());
		System.out.println("Ladder Map: " + board.getLadderMap());

		// Generating an unbiased 6 faced dice
		Dice dice = new Dice();

		// Setting up the game with board and dice
		Game game = new Game(board, dice);
		// Creating the players and initializing their positions
		game.createPlayers(2);
		Thread gameThread = new Thread(game);

		gameThread.start();

	}

}