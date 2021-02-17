package someones;

import java.io.*;
import java.util.*;

public class BJ1934_pys6790 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		for(int i=0; i<t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int a = Integer.parseInt(st.nextToken());			
			int b = Integer.parseInt(st.nextToken());
			
			sb.append(lcm(a, b)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		} else {
			return gcd(b, a%b);
		}
	}
	
	public static int lcm(int a, int b) {
		return a*b/gcd(a, b);
	}
}
