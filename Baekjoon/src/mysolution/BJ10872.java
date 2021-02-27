package mysolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ10872 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Integer.parseInt(br.readLine());
		long result = 1;
		for(int i=1; i<=n; i++) {
			result *= i;
		}
		
		System.out.print(n==0? 1:result);		
	}
}
