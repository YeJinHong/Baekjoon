import java.util.Scanner;

//1912
//연속합이 가장 큰 것을 고르는 문제.
public class ContinuousSum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int A[] = new int[n+1];
		for(int i=1; i<n+1; i++) {
			A[i] = sc.nextInt();
		}
		//dp[i] : 현재 chunk값을 저장. 이가 앞의 음의 집합보다 값이 커지는 순간 음의 값을 전부 합한값을 저장.
		int dp[] = new int[n];
		for(int i=1; i<n+1; i++) {
			
			if(dp[i-1] > 0 &&dp[i]+dp[i-1]>0) {
				dp[i] += dp[i-1];
			}
			
			
		}
		
	}
}
