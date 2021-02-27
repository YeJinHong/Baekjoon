package mysolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1676 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		int two = 0;
		int five = 0;
		for(int k=1; k<=n; k++) {
			int i = k;
			while(i%2==0) { // ��ǻ� �ʿ䰡 ���� �κ�. 2�� ����� 5�� ������� ������ ����.
				two++;
				i/=2;
			}
			while(i%5==0) {
				five++;
				i/=5;
			}
		}
		
		count = two>five? five : two;
		
		System.out.println(count);
		
	}
}
