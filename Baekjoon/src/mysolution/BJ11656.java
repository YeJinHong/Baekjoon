package mysolution;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

public class BJ11656 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String[] arr = new String[s.length()];
		for(int i=0; i<s.length(); i++) {
			arr[i] = s.substring(i);
		}
		Arrays.parallelSort(arr);
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<arr.length; i++) {
			sb.append(arr[i]).append('\n');
		}
		System.out.print(sb);
		
	}
}
