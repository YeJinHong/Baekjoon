package mysolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2609 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		//�ּ� �����(Greatest Common Division)
		int gcd = a>b? gcd(a,b) : gcd(b, a);
		//�ִ� �����(Least Common Multiple)
		int lcm = gcd*(a/gcd)*(b/gcd);
		
		System.out.println(gcd);
		System.out.println(lcm);
	}
	//��Ŭ���� ȣ����
	public static int gcd(int p, int q) {
		if(q==0) return p;
		return gcd(q, p%q);
	}
}
