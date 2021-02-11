package mysolution;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder s = new StringBuilder(br.readLine());
		StringBuilder result = new StringBuilder();
		int n[] = new int[26];
		
		
		for(int i=0; i<26; i++) 
			n[i] = -1;
	
		
		for(int i=0; i<s.length(); i++) {
			if(n[s.charAt(i)-97] == -1)
				n[s.charAt(i)-97] = i;
		}
		
		for(int i=0; i<26; i++) {
				result.append(n[i]).append(" ");
		}
		
		System.out.print(result);
	}
}
