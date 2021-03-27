package someones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ10451_kimensoo {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i < T; i++) {
			int cnt = 0;
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n+1];
			boolean[] isChecked = new boolean[n+1];
			st = new StringTokenizer(br.readLine());
			for(int j = i; j < arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			
			for(int j=1; j < arr.length; j++) {
				if(!isChecked[j]) {
					isChecked[j] = true;
					int node = arr[j];
					if(node == j) cnt++;
					while(j != node) {
						isChecked[node] = true;
						node = arr[node];
						if(isChecked[node]) {
							cnt++;
							break;
						}
					}
					
				}
			}
			sb.append(cnt).append('\n');
		}
		
		System.out.print(sb);
		br.close();
	}
}
