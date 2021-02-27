package someones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//소수 구하기
public class BJ1929_skrud3021 {
	public static void main(final String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		sieveOfEratosthenes(M, N);
	}
	
	private static void sieveOfEratosthenes(int start, int end) {
		boolean[] sieve = new boolean[end+1];
		StringBuilder sb = new StringBuilder();
		
		for(int i=2; i<=Math.sqrt(end); i++) {
			int j=2;
			while(i*j <= end) {
				if(!sieve[i*j])
					sieve[i*j] = true;
				j++;
			}
		}
		
		for(int i=start; i<end+1; i++) {
			if(!sieve[i]&&i!=1)
				sb.append(i).append("\n");
		}
		
		System.out.println(sb);
	}
}
