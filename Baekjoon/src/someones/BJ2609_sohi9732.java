package someones;

import java.io.*;
import java.util.*;

public class BJ2609_sohi9732 {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		if(a<b) { //������ a>b�� �ǵ���
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
		
		/** ��Ŭ���� ȣ���� : �������� 0�� �� ������ (������ ��) / (������) **/
		/** �ð����⵵ : O(logN) **/
		if(rest == 0) gcd = b;
		else GCD(b, rest);
		
		return;
	}
}
