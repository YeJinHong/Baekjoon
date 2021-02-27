package mysolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 소인수 분해
public class BJ11653 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		if(n==1)
			return;
		StringBuilder sb = new StringBuilder();
		for(int i=2; i<=n; i++) {
			while(n%i == 0) {
				sb.append(i).append("\n");
				n = n/i;
			}			
		}

		sb.deleteCharAt(sb.lastIndexOf("\n"));
		System.out.println(sb);
		
	}
}
