
import java.util.Arrays;
import java.util.Scanner;

public class GoT1 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();

		System.out.println(validPalidrome(input));
	}
	
	public static String validPalidrome(String str) {
		
		String valid = "YES";
		int flag = 0;
		char[] array = str.toCharArray();
		Arrays.sort(array);
	
		
		if( str.length() == 1 ) return "YES";
		if( str.length() == 3 ) {
			if((array[0] == array[1]) || (array[1] == array[2])) {
			return "YES";
			}
			return "NO";
		}
		
		for(int i=0; i<array.length-1; i+=2) {
			 if(array[i]!=array[i+1]) flag++;
		}
		if(str.length()%2==0) {
				if(flag!=0) valid = "NO";
		}
		else {
			if((array[str.length()-2] != array[str.length()-1]) && flag == 0) {
				return "YES";
			}
				if(flag!=1) valid = "NO"; 
		}
		return valid;
	}
}
