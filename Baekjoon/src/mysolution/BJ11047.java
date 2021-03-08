package mysolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// µ¿Àü 0
public class BJ11047 {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int k = Integer.parseInt(s[1]);
		int A[] = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = Integer.parseInt(br.readLine());
		}
		int count = 0;

		for (int i = n-1; i >= 0 && k>0; i--) {
			int coin = k/A[i];
			if (coin > 0) {
				k %= A[i];
				count += coin;
			}
		}
		
		System.out.print(count);
	}
}
