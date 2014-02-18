import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Median {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		scanner.nextLine();
		List<String> strings = new ArrayList<String>();
		List<Double> integers = new ArrayList<Double>();
		int i = 0;
		while (i < size) {
			strings.add(scanner.nextLine());
			i++;
		}
					
		String[] temp = null;
		for (String s : strings) {
			temp = s.split(" ");
			if(temp[0].equalsIgnoreCase("a")) {
				integers.add(Double.valueOf(temp[1]));
				System.out.println(getMedian(integers));
			}
			else if(temp[0].equalsIgnoreCase("r")) {
				if(!integers.contains(Double.valueOf(temp[1]))) {
					System.out.println("Wrong!");
				}
				else {
					integers.remove(Double.valueOf(temp[1]));
					System.out.println(getMedian(integers));
				}
			}
		}
	}

	public static String getMedian(List<Double> integers) {
		double median = 0;
		Collections.sort(integers);
		if(integers.size()==0) {
			return "Wrong!";
		}
		if(integers.size()==1) {
			median = integers.get(0);
		}
		if(integers.size()%2==0) {
			median = (integers.get((integers.size()/2)-1)+integers.get((integers.size()/2)))/2;
		}
		else if(integers.size()%2!=0 && integers.size()>1){
			median = integers.get((integers.size()/2));
		}
		return removeTrailingZeros(median);
	}
	private static String removeTrailingZeros(double d) {
		  return new BigDecimal(d).toPlainString();
		}
}
