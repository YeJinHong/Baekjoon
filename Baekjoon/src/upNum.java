import java.util.Scanner;

public class upNum {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N<1||N>1000)
			System.err.print("out of bound");
		long dp[][] = new long[1001][11];
		
		//dp[k][l] : k자리수의 끝수가 l일때 오르막 수
		//dp[k][0] = dp[k-1][0] 
		//dp[k][l] = dp[k-1][l]+dp[k-1][l-1]+...
		for(int i=0; i<10; i++) {
			dp[1][i] = 1; 
		}
		
		for(int i=2; i<=N; i++) {
			dp[i][0] = dp[i-1][0];
			for(int j=1; j<10; j++) {
				long s = 0;
				for(int k=0; k<=j; k++) {
					s += dp[i-1][j-k];
				}
				dp[i][j] = s%10007;
			}
		}
		
		long sum = 0;
		for(int i=0; i<10; i++)
			sum += dp[N][i];
		sum = sum%10007;
		
		System.out.println(sum);
	}
}
