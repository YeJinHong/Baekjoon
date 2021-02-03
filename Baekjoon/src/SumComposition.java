import java.util.Scanner;

//2225
//�պ���
public class SumComposition {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int dp[][] = new int[N+1][K+1];
		
		//dp[i][k] : ���� k���� ���ؼ� �� ���� i�� �Ǵ� ����� ��.
		//dp[i][k] = dp[i][k-1]+dp[i-1][k-1]+dp[i-2][k-1]+...+dp[0][k-1]
		
		for(int i=1; i<=N; i++) {
			dp[i][1] = 1; // �� ���� ���ؼ� �� ���� �Ǵ°� �ϳ� ����.
			for(int j=1; j<=K; j++) {
				dp[0][j] = 1; // �� ���� ���ϴ��� 0�� �Ǵ� ���� 0 �ϳ�.
				for(int l=0; l<=i; l++) {
					dp[i][j] += dp[l][j-1];
					dp[i][j] %= 1000000000;
				}
			}
		}
		System.out.println(dp[N][K]);
	}
}
