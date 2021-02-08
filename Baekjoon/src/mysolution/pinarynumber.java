package mysolution;
import java.util.Scanner;

//2193
public class pinarynumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N<1||N>90)
			System.err.print("out of bound");
		
		long dp[][] = new long[91][2];
		//dp[k][l] : k자리 수의 끝수가 l일 때 가능한 이친수
		//끝 수가 0일때 - 이전의 수는 0,1 두가지 가능
		//끝 수가 1일때 - 이전 수는 0
		// dp[k][1] = dp[k-1][0]
		// dp[k][0] = dp[k-1][0]+dp[k-1][1]
		
		dp[1][0] = 0;
		dp[1][1] = 1;
		
		for(int i=2; i<=N; i++) {
			dp[i][1] = dp[i-1][0];
			dp[i][0] = dp[i-1][0]+dp[i-1][1];
		}
		
		System.out.println(dp[N][0]+dp[N][1]);
	}
}
