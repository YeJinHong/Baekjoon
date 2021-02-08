package mysolution;
import java.util.Scanner;

public class LongestDecreasingSequence {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		
		int dp[] = new int[N];
		
		for(int i=0; i<N; i++) {
			dp[i] = 1;
			for(int j=0; j<i; j++) {
				if(A[j]>A[i]&&dp[i]<dp[j]+1)
					dp[i] = dp[j]+1;
			}
		}
		
		// ÃÖ´ñ°ª(ÃÖ´ë ±æÀÌ) Å½»ö 
		int max = -1;
		for (int i = 0; i < N; i++) {
			max = dp[i] > max ? dp[i] : max;
		}
		System.out.println(max);
	}
}
