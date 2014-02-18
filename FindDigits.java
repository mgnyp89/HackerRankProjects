import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FindDigits {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		int testcases = scanner.nextInt();
		scanner.nextLine();
		List<String> strings = new ArrayList<String>();
		int i = 0;
		while (i < testcases) {
			strings.add(scanner.nextLine());
			i++;
		}
		int num = 0;
		int counter = 0;
		int temp;
		for (String s : strings) {
			counter = 0;
			num = Integer.valueOf(s);
			temp = num;
			while (temp > 0) {
			   if((temp%10)!=0 && (num%(temp%10)==0)) counter++;
			    temp = temp/10;
			}
			System.out.println(counter);
		}
	}

}
