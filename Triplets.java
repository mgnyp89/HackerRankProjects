
import java.util.Hashtable;
import java.util.Scanner;


public class Triplets {
	
	 private final int key1;  
	 private final int key2;
	 private final int key3;
	    public Triplets(int key1, int key2, int key3) {  
	        this.key1 = key1;  
	        this.key2 = key2;  
	        this.key3 = key3;
	    }  
	    public boolean equals(Object obj) {  
	        if (!(obj instanceof Triplets))  
	            return false;  
	        Triplets other = (Triplets) obj;  
	        return this.key1 == (other.key1)  
	            && this.key2 == (other.key2)
	            && this.key3 == (other.key3);  
	    }  
	    public int hashCode() {  
	        int result = 17;  
	        result = 37 * result + (int)Math.random()*key1;  
	        result = 37 * result + (int)Math.random()*key2;
	        result = 37 * result + (int)Math.random()*key3;
	        return result;  
	    }  
	
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		int[] inputs = new int[n];
		String[] input = scanner.nextLine().split(" ");
		for (int i = 0; i < n; i++) {
			inputs[i] = Integer.valueOf(input[i]);
		}
		System.out.println(numOfTriplets(inputs));
	}
	public static int numOfTriplets(int[] array) {
		Hashtable<Triplets,Integer> triplets = new Hashtable<Triplets,Integer>();
		int counter = 0;
		for(int i=0; i<array.length; i++) {
			for(int j=i+1; j<array.length; j++) {
				for(int k=j+1; k<array.length; k++) {
					if((array[i]<array[j]) && (array[j]<array[k])) {
						triplets.put(new Triplets(array[i],array[j],array[k]), counter);
					}
				}
			}
		}
		return triplets.keySet().size();
	}
}
