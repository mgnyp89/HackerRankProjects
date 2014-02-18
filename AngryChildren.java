
import java.util.Arrays;
import java.util.Scanner;

public class AngryChildren {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		// num of text cases
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		// num of text cases
		int[] inputs = new int[n];
		int j = 0;
		while (j < n) {
			inputs[j] = scanner.nextInt();
			j++;
		}
		Arrays.sort(inputs);
		int lower = inputs[0];
		int upper = inputs[k-1];
		int minUnfairness = upper - lower;
		for(lower = 0, upper = k; upper < inputs.length ; lower++, upper++) {
			if((inputs[upper]-inputs[lower]) < minUnfairness)  minUnfairness = (inputs[upper]-inputs[lower]);
		}
		System.out.println(minUnfairness);
	}
}
