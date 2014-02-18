import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PointOfSymmetry {
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
		String [] values = null;
		for (String s : strings) {
			values = s.split(" ");
			// xs
			System.out.print(Integer.valueOf(values[2])+(Integer.valueOf(values[2])-Integer.valueOf(values[0]))+" ");
			// ys
			System.out.println(Integer.valueOf(values[3])+(Integer.valueOf(values[3])-Integer.valueOf(values[1])));
		}
	}

}
