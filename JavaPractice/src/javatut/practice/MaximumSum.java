package javatut.practice;
/*
4
A: 5 -2 7 -3

form sub arrays of A and get maximum within that sub arrays and add unique values of these max'm and print

5 : 5
5 -2 : 5
5 -2 7 : 10
---------
ans: 17
*/

import java.util.*;

class MaximumSum {
	public static void main(String args[]) throws Exception {

		Scanner s = new Scanner(System.in);

		String nS = s.nextLine();
		int n = Integer.parseInt(nS);
		String sArr[] = s.nextLine().split(" ");
		int l = sArr.length;
		int[][] mat = new int[l][l];

		int num[] = new int[l];
		for (int i = 0; i < l; i++) {
			num[i] = Integer.parseInt(sArr[i]);
		}

		mat = getSumOfAllSubArrs(num, l);
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < l; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println("");
		}
		Set<Integer> res = new HashSet<>();
		for (int i = 0; i < l; i++) {
			for (int j = i; j < l; j++) {
				int anss = maxSum(num, mat, i, j);
				System.out.print(anss + " ");
				res.add(anss);
			}
		}
		System.out.println("");
		int ans = 0;
		for (Integer r : res) {
			ans += r;
		}
		System.out.println(ans);

	}

	private static int[][] getSumOfAllSubArrs(int[] num, int l) {
		int[][] mat = new int[l][l];
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < l; j++) {
				int count = 0;
				int sum = 0;
				while (count <= i && (j + count) < l && l - j > i) {
					sum += num[j + count];
					count++;
				}
				mat[i][j] = sum;
			}
		}
		return mat;
	}

	private static int maxSum(int[] num, int[][] mat, int l, int r) {

		int max = Integer.MIN_VALUE;
		for (int i = l; i <= r; i++) {

			for (int j = i; j <= r; j++) {

				max = (mat[j - i][i] > max) ? mat[j - i][i] : max;

			}
		}
		return max;

	}

}
