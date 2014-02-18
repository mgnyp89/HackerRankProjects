
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;
import java.util.Map.Entry;

public class MissingNumbers {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		// length of A
		int n = scanner.nextInt();
		scanner.nextLine();
		String[] inputA = scanner.nextLine().split(" ");
		// length of B
		int m = scanner.nextInt();
		scanner.nextLine();
		String[] inputB = scanner.nextLine().split(" ");
		
		Hashtable<Integer, Integer> hashA = new Hashtable<Integer, Integer>();
		Hashtable<Integer, Integer> hashB = new Hashtable<Integer, Integer>();

		for (int i = 0; i < m; i++) {
			Integer val = hashB.get(Integer.valueOf(inputB[i]));
			if (val == null) {
				val = new Integer(0);
			}
			++val;
			hashB.put(Integer.valueOf(inputB[i]), val);
		}
		for (int i = 0; i < n; i++) {
			Integer val = hashA.get(Integer.valueOf(inputA[i]));
			if (val == null) {
				val = new Integer(0);
			}
			++val;
			hashA.put(Integer.valueOf(inputA[i]), val);
		}

		// difference between the length of A and B
		List<Integer> results = new ArrayList<Integer>();
		for (Entry<Integer, Integer> i : hashA.entrySet()) {
			if((hashB.containsKey(i.getKey()) && !hashB.get(i.getKey()).equals(i.getValue())) || !hashB.containsKey(i.getKey())){
	           results.add(i.getKey());
	        }
		}
		Collections.sort(results);
		for(int i:results) {
			System.out.print(i+" ");
		}
	}
}
