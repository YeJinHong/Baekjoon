import java.util.Scanner;

//1699
//주어진 자연수 N을 최소 제곱수의 항으로 표현할 때 그 항의 개수 출력.
//답 봄
public class SquareNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int dp[] = new int[N+1];
		for(int i=1; i<=N; ++i) {
			dp[i] = i; // 1의 제곱으로만 이루어진 경우.
			for(int j=1; j*j <= i; ++j) {
				dp[i] = Math.min(dp[i], dp[i-j*j]+1);
				
			}
		
		}
		System.out.println(dp[N]);
	}
}
