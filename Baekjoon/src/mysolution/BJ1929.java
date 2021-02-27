package mysolution;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 소수 구하기.

public class BJ1929 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int p[] = new int[n + 1];
		
		p[0] = 1;
		p[1] = 1;
		for(int i=2; i<=n; i++) {
			if(p[i] == 0) {
				// 무언가의 배수이며 m~n의 범위에 있는 것은 1로 표시.
				for(int j=i+i; j<=n; j+=i) {
					if(m<=j) {
						p[j] = 1;
					}
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=m; i<p.length; i++) {
			if(p[i] == 0)
				sb.append(i).append("\n");
		}
		if(n-m>0)
			sb.deleteCharAt(sb.lastIndexOf("\n"));
		
		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
			
	}
}
