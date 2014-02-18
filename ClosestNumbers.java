import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ClosestNumbers {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		int[] inputs = new int[n];
		String[] input = scanner.nextLine().split(" ");
		for (int i = 0; i < n; i++) {
			inputs[i] = Integer.valueOf(input[i]);
		}
		Arrays.sort(inputs);
		List<Integer> pairs = new ArrayList<Integer>();
		int smallestDifference = checkPairs(inputs[0], inputs[1]);
		pairs.add(inputs[0]);
		pairs.add(inputs[1]);
		for (int i = 1; i < n - 1; i++) {
			if (checkPairs(inputs[i], inputs[i + 1]) == smallestDifference) {
				pairs.add(inputs[i]);
				pairs.add(inputs[i + 1]);
			}
			if (checkPairs(inputs[i], inputs[i + 1]) < smallestDifference) {
				smallestDifference = checkPairs(inputs[i], inputs[i + 1]);
				pairs.clear();
				pairs.add(inputs[i]);
				pairs.add(inputs[i + 1]);
			}
		}
		for (Integer i : pairs) {
			System.out.print(i + " ");
		}
	}

	public static int checkPairs(int x, int y) {
		if (x < y)
			return Math.abs(x - y);
		else
			return Math.abs(y - x);
	}
}
