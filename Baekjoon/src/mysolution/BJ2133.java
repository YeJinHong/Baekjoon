package mysolution;
import java.util.Scanner;

//타일 채우기
//답 봄.
public class BJ2133 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int dp[] = new int[N+1];
		
		dp[0] = 1;
		dp[1] = 0;
		dp[2] = 3;
		
		if(N%2==0) {
			for(int i=4; i<=N; i+=2) {
				dp[i] = dp[i-2]*3;
				
				for(int j=4; i-j>=0; j+=2) {
					dp[i]+=dp[i-j]*2;
				}
			}
		}
		
		System.out.print(dp[N]);
		
	}
}
