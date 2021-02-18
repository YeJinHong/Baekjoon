package mysolution;

import java.io.*;
import java.util.*;

public class BJ1850 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		long a = Long.parseLong(s[0]);
		long b = Long.parseLong(s[1]);
		
		if(a>b) { // b가 항상 크도록
			long temp = b;
			b = a;
			a = temp;
		}
		
		long k = GCD(b, a);
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<k; i++) {
			sb.append(1);
		}
		
		System.out.println(sb);
		
	}
	public static long GCD(long p, long q) {
		if(q==0) return p;
		else return GCD(q, p%q);
	}
}

