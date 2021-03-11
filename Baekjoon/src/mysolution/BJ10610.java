package mysolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BJ10610 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		Integer num[] = new Integer[n.length()];
		int sum = 0;
		for(int i=0; i<n.length(); i++) {
			num[i] = n.charAt(i) - 48;
			sum += num[i];
		}
		StringBuilder result = new StringBuilder();
		
		if(n.indexOf('0') != -1 && sum%3 == 0) {
			
			Arrays.sort(num, Comparator.reverseOrder());
			for(int i : num)
				result.append(i);
			
		} else {
			result.append(-1);
		}
		
		System.out.println(result);
	}
}
