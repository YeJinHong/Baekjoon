package mysolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//ATM
public class BJ11399 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int P[] = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			P[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.parallelSort(P);
		
		int sum = 0;
		for(int i=0; i<n; i++) {
			sum += (n-i)*P[i];
		}
		
		System.out.println(sum);
	}
}
