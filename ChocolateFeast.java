import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ChocolateFeast {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		// num of text cases
		int cases = scanner.nextInt();
		List<String> inputs = new ArrayList<String>();
		for (int i = 0; i <= cases; i++) {
				inputs.add(scanner.nextLine());
		}
		String[] nums;
		for(String s:inputs) {
			if(!s.isEmpty()) {
			nums = s.split(" ");
			System.out.println(calculateChocolates(Integer.valueOf(nums[0]),Integer.valueOf(nums[1]),Integer.valueOf(nums[2])));
			}
		}
	}
	public static int calculateChocolates(int n, int c, int m) {
		int chocolates = n/c;
		int wrappers = chocolates;
		int exchanged = 0;
		while(wrappers>=m) {
			exchanged = wrappers/m;
			wrappers = (wrappers%m)+exchanged;
			chocolates += exchanged;
		}
		return chocolates;
	}
}
