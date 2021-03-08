package mysolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 숫자 카드 2
public class BJ10816 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] positive = new int[10000001];
		int[] negative = new int[10000001];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			int a = Integer.parseInt(st.nextToken());
			if(a < 0)
				negative[a*(-1)]++;
			else
				positive[a]++;
		}
		int m = Integer.parseInt(br.readLine());
		//int arr[] = new int[m];
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<m; i++) {
			int idx = Integer.parseInt(st.nextToken());
			if(idx < 0)
				sb.append(negative[idx*(-1)]).append(" ");
			else
				sb.append(positive[idx]).append(" ");
		}
		sb.deleteCharAt(sb.lastIndexOf(" "));
		System.out.println(sb.toString());		
	}
}
