package mysolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Base Conversion
public class BJ11576 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int A = Integer.parseInt(s[0]);
		int B = Integer.parseInt(s[1]);
		int m = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = new int[m];
		for(int i=0; i<m; i++) {
			arr[i] = Integer.parseInt(st.nextToken()); 
		}
		
		int decimal = 0; // 10진법 표시 저장		
		int tmp = 1;
		for(int i=m-1; i>=0; i--) {
			decimal += arr[i]*tmp;
			tmp *= A;
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(decimal%B);
		decimal = decimal/B;
		
		while(decimal > 0) {
			sb.insert(0, " ");
			sb.insert(0, decimal%B);
			decimal = decimal/B;		
		}
		
		System.out.print(sb);
	}
}
