package mysolution;

import java.util.Scanner;

//��ȣ �ڵ�
//��Ǯ�� �亽-������ �ݷʿ� �������� �ڵ�� ���� ���� �ڵ尡 �ƴ�.

/* 00, 30, 40, 50, 60, 70, 80, 90 : 0
 * 10,20 : dp[i-2]
 * 01~09, 27~99 : dp[i-1]
 * 11~19, 21~26 : dp[i-2]+dp[i-1]
 * */
public class BJ2011 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		long dp[] = new long[s.length() + 1];
		// �ڿ��� �ΰ��� ���ڸ� Ȯ���Ѵ�.

		// dp[i] : ���� N�� i��° �ڸ����� ���ڵ��ϴ� ����� ��.
		dp[0] = 1;
		dp[1] = 1;
		String st;
		int n;
		int a;
		int b;
		dp = new long[s.length() + 1];
		dp[0] = 1;
		dp[1] = 1;
		for (int i = 2; i <= s.length(); i++) {
			st = s.substring(i - 2, i);
			n = Integer.parseInt(st);
			a = n / 10; // �ڿ��� �ι�° ����
			b = n % 10; // �ڿ��� ù��° ����
			if (i == 2 && a == 0)
				break;

			if (b == 0) {
				if (a == 1 || a == 2)
					dp[i] = dp[i - 2];
				else
					dp[i] = 0;
			} else if (n < 10 || n > 26) {
				dp[i] = dp[i - 1];
			} else {
				dp[i] = (dp[i - 2] + dp[i - 1]) % 1000000;
			}

		}

		System.out.println(s.contentEquals("0") ? 0 : dp[s.length()]);

	}
}
