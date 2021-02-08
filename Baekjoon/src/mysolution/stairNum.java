package mysolution;
import java.util.Scanner;

//10844
public class stairNum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N<1||N>100)
			System.err.println("out of bound");
		// 길이가 N일 때, 마지막 수가 L일 경우 계단 수
		// dp[N][L] = dp[N-1][L-1]+dp[N-1][L+1]
		long dp[][] = new long[101][11];
		
		for(int i=1; i<10; i++)
			dp[1][i] = 1;
		
		for(int i = 2; i<= N; i++) {
			dp[i][0] = dp[i-1][1];
			for(int j=1; j<= 9; j++) {
				dp[i][j] = (dp[i-1][j-1]+dp[i-1][j+1])%1000000000;
			}
		}
		
		long sum = 0;
		
		for(int i=0; i<10; i++) {
			sum += dp[N][i];
		}
		
		System.out.println(sum%1000000000);
	}
}
