package com.assignment.score;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainTotalScore {

	static int count;
	static int K;

	public static void main(String[] args) {

		System.out.println("Enter the totla score value (0<N>=1000) :");
		Scanner in = new Scanner(System.in);

		K = in.nextInt();

		// number of roots to the equation 3x+7y+14z=K gives us the answer..
		// we will find it by iterative method

		// Creating list and map to get the solution details as well..
		
		Map<Integer, ArrayList<Integer>> resultSet = new HashMap<>();
		ArrayList<Integer> rootsList;
		LocalTime start = LocalTime.now();
		for (int x = 0; x <= (K / 3); x++) {
			for (int y = 0; y <= (K / 7); y++) {
				for (int z = 0; z <= (K / 14); z++) {
					if (3 * x + 7 * y + 14 * z - K == 0) {
						count++;
						rootsList = new ArrayList<>();
						rootsList.addAll(Arrays.asList(x, y, z));
						resultSet.put(count, rootsList);
					}
				}
			}
		}
		LocalTime end = LocalTime.now();
		System.out.println(resultSet);
		System.out.println(count);
//		System.out.println(count + " and "+ Duration.between(start, end).toMillis());

	}

}
