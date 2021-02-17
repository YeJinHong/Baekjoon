package someones;

import java.io.*;
import java.util.*;

public class BJ2609_sohi9732 {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		if(a<b) { //무조건 a>b가 되도록
			int tmp = b;
			b = a;
			a = tmp;
		}
		
		GCD(a, b);
		System.out.println(gcd);
		System.out.println(gcd*a/gcd*b/gcd);
	}
	
	static int gcd;
	
	private static void GCD(int a, int b) {
		int rest = a%b;
		
		/** 유클리드 호제법 : 나머지가 0이 될 때까지 (나누는 수) / (나머지) **/
		/** 시간복잡도 : O(logN) **/
		if(rest == 0) gcd = b;
		else GCD(b, rest);
		
		return;
	}
}
