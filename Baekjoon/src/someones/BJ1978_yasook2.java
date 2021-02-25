package someones;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1978_yasook2 {
	
	static int N, ans;
	static int P[] = new int[1001];
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		P[0] = 1;
		P[1] = 1;
		for(int i=2; i < 1001; i++) {
			
			if(P[i]==0) {
				for(int j=i+i; j<1001; j=j+i) {
					P[j] = 1;
				}
			}
		}
			
			N = Integer.parseInt(br.readLine());
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			//count
			ans = 0;
			for(int i=0; i<N; i++) {
				int j = Integer.parseInt(st.nextToken());
				
				if(P[j]==0)
					ans++;
			}
			
			System.out.println(ans);
		}
}
