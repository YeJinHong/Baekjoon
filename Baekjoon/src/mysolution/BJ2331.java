package mysolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;



public class BJ2331 {
	static int A;
	static int P;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		A = Integer.parseInt(st.nextToken());
		P = Integer.parseInt(st.nextToken());
		ArrayList arr = new ArrayList();
		arr.add(A);
		
		int next = getNext(A);
		while(!arr.contains(next)) {
			arr.add(next);
			next = getNext(next);
		}
		
		int count = 0;
		while((Integer)arr.get(count) != next) {
			count++;
		}
		
		System.out.println(count);
	}
	
	public static int getNext(int n) {
		int tmp = 0;
		int next = 0;
		for(int i=1; i <= n; i*=10) {
			tmp = n/i;
			int num = tmp%10;
			next += Math.pow(num, P);
		}
		return next;
	}
}
