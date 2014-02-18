import java.util.Arrays;
import java.util.Scanner;


public class MarkToya {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		// num of text cases
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		// num of text cases
		int[] inputs = new int[n];
		 scanner.nextLine();
		String[] prices = scanner.nextLine().split(" ");
		for(int i=0; i<prices.length; i++) {
			inputs[i] = Integer.valueOf(prices[i]);
		}
		int counter = 0;
		Arrays.sort(inputs);
		int i = 0;
			while(k>inputs[i]) {
				k -= inputs[i];
				counter++;
				i++;
		}
		System.out.println(counter);
	}
}
