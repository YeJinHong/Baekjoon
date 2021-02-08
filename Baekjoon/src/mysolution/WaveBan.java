package mysolution;
import java.util.Scanner;

//9461
//기하학적인 설명이 부족함. 귀납적 결론임.
public class WaveBan {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N;
		long dp[] = new long[101];
		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 1;
		for(int i=3; i<=100; i++) {
			dp[i] = dp[i-2]+dp[i-3];
		}
		while(true) {
			N = sc.nextInt();
			System.out.println(dp[N-1]);
		}
	}
}
