import java.util.Scanner;

public class UtopianTree {
	public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
	int testcases = scanner.nextInt();
	int[] cycles = new int[testcases];
	for (int i = 0; i < testcases; i++) {
		cycles[i] = scanner.nextInt();
	}
	
	for(int j:cycles) {
		System.out.println(getHeight(j));
	}
	
	}
	public static int getHeight(int cycles) {
		int initialHeight = 1;
		int i=0;
		while(i<cycles) {
			if(i%2==0) initialHeight *= 2;
			else initialHeight += 1;
			i++;
		}
		return initialHeight;
	}
}
