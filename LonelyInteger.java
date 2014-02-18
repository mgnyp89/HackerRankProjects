import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Scanner;


public class LonelyInteger {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		int[] inputs = new int[n];
		String[] input = scanner.nextLine().split(" ");
		for (int i = 0; i < n; i++) {
			inputs[i] = Integer.valueOf(input[i]);
		}
		Hashtable<Integer, Integer> hash = new Hashtable<Integer,Integer>();
		for (int j = 0; j < inputs.length; j++) {
			Integer val = hash.get(inputs[j]);
			if(val == null) {
				val = new Integer(0);
			}
			++val;
			hash.put(inputs[j], val);
		}		
		for(Entry<Integer, Integer> i :hash.entrySet()) {
			if(i.getValue() == 1) {
				System.out.println(i.getKey());
			}
		}
	}
}
