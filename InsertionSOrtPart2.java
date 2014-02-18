import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertionSOrtPart2 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int testcases = scanner.nextInt();
		List<String> inputs = new ArrayList<String>();
		scanner.nextLine();
		for (int i = 0; i < testcases *2; i++) {
			inputs.add(scanner.nextLine());
		}
		int counter = 0;
		int size = 0;
		int[] arr = null;
		String[] temp = null;
		for(String var:inputs) {
			if(counter%2 == 0) {
				size = Integer.valueOf(var);
			}
			if(counter%2 == 1) {
				arr = new int[size];
				temp = var.split(" ");
				for(int i=0; i<arr.length; i++) {
					arr[i] = Integer.valueOf(temp[i]);
				}
				System.out.println(insertionsort2(arr));
			}
			counter++;
		}
	}

	public static int insertionsort(int[] array) {
		int temp = 0;
		int shift = 0;
		int numShifts = 0;
		for (int i = 1; i < array.length; i++) {
			temp = array[i];
			shift = i;
			while (shift > 0 && array[shift - 1] > temp) {
				array[shift] = array[shift - 1];
				shift--;
				numShifts++;
			}
			array[shift] = temp;
		}
		return numShifts;
	}
	public static int insertionsort2(int[] array) {
		int temp = 0;
		int shift = 0;
		int numShifts = 0;
		for (int i = 1; i < array.length; i++) {
			temp = array[i];
			shift = i;
			while (shift > 0 && array[shift - 1] > temp) {
				shift--;
				numShifts++;
			}
			array[shift] = temp;
		}
		return numShifts;
	}
}