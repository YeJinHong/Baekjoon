package mysolution;
import java.util.Scanner;
import java.lang.Math;

//��ƼĿ
//���� �����. �� ��.
public class BJ9465 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			if (n < 1 || n > 100000)
				System.err.println("out of bound");
			int st[][] = new int[2][n + 1];
			int dp[][] = new int[2][n + 1];

			for (int i = 0; i < 2; i++) {
				for (int j = 1; j < n + 1; j++) {
					st[i][j] = sc.nextInt();

					if (st[i][j] < 0 || st[i][j] > 100)
						System.err.println("out of bound");
				}
			}
			dp[0][0] = 0;
			dp[1][0] = 0;

			// �� ���� st[0][], �Ʒ����� st[1][]
			dp[0][1] = st[0][1];
			dp[1][1] = st[1][1];

			/*
			 * case1 oxx xxo case2 .ox .xo
			 */
			// ��ĭ �� �밢������ ���� ���� �� ĭ �� �밢������ ���� ��츦 ���.
			// �׷���, ������ �� ���� ������ �����̶�� ������ ����.
			// ���� 0�� 1�� �ΰ��� ������ ����ϴ� ��.
			for (int i = 2; i < n + 1; i++) {
				dp[0][i] = Math.max(dp[1][i - 1], dp[1][i - 2]) + st[0][i];
				dp[1][i] = Math.max(dp[0][i - 1], dp[0][i - 2]) + st[1][i];

			}
			System.out.println(Math.max(dp[0][n], dp[1][n]));
		}
	}
}
