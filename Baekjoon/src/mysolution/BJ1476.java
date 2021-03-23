package mysolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 날짜 계산
public class BJ1476 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int E = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int i = 0;
		int ans = E; //  ans = (15*i+E)
		while(true) {
			if((ans-S)%28 == 0 && (ans-M)%19 == 0) {
				break;
			}
			i++;
			ans = 15*i + E;
		}
		
		System.out.println(ans);
		
	}
}
