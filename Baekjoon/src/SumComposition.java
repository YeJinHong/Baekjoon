import java.util.Scanner;

//2225
//합분해
public class SumComposition {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int dp[][] = new int[N+1][K+1];
		
		//dp[i][k] : 정수 k개를 더해서 그 합이 i가 되는 경우의 수.
		//dp[i][k] = dp[i][k-1]+dp[i-1][k-1]+dp[i-2][k-1]+...+dp[0][k-1]
		
		for(int i=1; i<=N; i++) {
			dp[i][1] = 1; // 한 개를 더해서 그 값이 되는건 하나 뿐임.
			for(int j=1; j<=K; j++) {
				dp[0][j] = 1; // 몇 개를 더하더라도 0이 되는 것은 0 하나.
				for(int l=0; l<=i; l++) {
					dp[i][j] += dp[l][j-1];
					dp[i][j] %= 1000000000;
				}
			}
		}
		System.out.println(dp[N][K]);
	}
}
