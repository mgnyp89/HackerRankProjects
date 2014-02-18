import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TwoArrays {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int testcases = scanner.nextInt();
		List<String> inputs = new ArrayList<String>();
		scanner.nextLine();
		for (int i = 0; i < testcases * 3; i++) {
			inputs.add(scanner.nextLine());
		}

		int count = 0;
		int term = 0;
		List<Integer> A = new ArrayList<Integer>();
		List<Integer> B = new ArrayList<Integer>();
		String[] temp = null;
		int i = 0;
		boolean flag = false;
		for (String s : inputs) {
			if(flag) {
				check(A,B,term);
			}
			if (count%3 == 0) {
				term = Integer.valueOf(s.split(" ")[1]);
				A.clear();
				B.clear();
				flag = false;
			}
			if (count%3 == 1) {
				temp = s.split(" ");
				while (i < temp.length) {
					A.add(Integer.valueOf(temp[i]));
					i++;
				}
				i=0;
			} 
			if (count%3 == 2) {
				temp = s.split(" ");
				while (i < temp.length) {
					B.add(Integer.valueOf(temp[i]));
					i++;
				}
				i=0;
				flag = true;
			}
			count++;
			}
		check(A,B,term);
	}

	public static void check(List<Integer> A, List<Integer> B, int term) {
		int matches = 0;
		Collections.sort(A);
		Collections.sort(B);
		for (int i = 0; i < A.size(); i++) {
			for (int j = 0; j < B.size(); j++) {
				if (B.get(j) != null &&(A.get(i) + B.get(j) >= term)) {
					B.set(j,null);
					matches++;
					break;
				}
			}
		}
		if (matches == A.size()) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
