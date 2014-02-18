import java.util.Scanner;

public class InsertionSortPart1 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		int[] inputs = new int[n];
		String[] input = scanner.nextLine().split(" ");
		for (int i = 0; i < n; i++) {
			inputs[i] = Integer.valueOf(input[i]);
		}
		insertionsort(inputs);
		// final array
		for (int j = 0; j < inputs.length; j++) {
			System.out.print(inputs[j] + " ");
		}
		System.out.println();
	}

	public static void insertionsort(int[] array) {
		int temp = 0;
		int shift = 0;
		for (int i = 1; i < array.length; i++) {
			temp = array[i];
			shift = i;
			while (shift > 0 && array[shift - 1] >= temp) {
				array[shift] = array[shift - 1];
				shift--;
				for (int j = 0; j < array.length; j++) {
					System.out.print(array[j] + " ");
				}
				System.out.println();
			}
			array[shift] = temp;
		}
	}
}
