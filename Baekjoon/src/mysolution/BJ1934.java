package mysolution;

import java.io.*;
import java.util.*;

public class BJ1934 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int a, b;
		StringBuilder sb = new StringBuilder();
		while(t-->0) {
			String[] s = br.readLine().split(" ");
			a = Integer.parseInt(s[0]);
			b = Integer.parseInt(s[1]);
			
			int gcd = a>b? GCD(a, b) : GCD(b, a);
			
			sb.append(gcd*(a/gcd)*(b/gcd)).append("\n");
		}
		System.out.print(sb);
	}
	public static int GCD(int p, int q) {
		if(q==0) return p;
		else return GCD(q, p%q);
	}
}
