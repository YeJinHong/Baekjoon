import java.util.Scanner;
import java.util.TreeSet;

//11053
public class IncreasingSequence {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N<1||N>1000)
			System.err.println("out of bound");
		int A[] = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
			if(A[i]<1||A[i]>1000)
				System.err.println("out of bound");
		}
		
		int dp[] = new int[N];
		
		for(int i=0; i<N; i++) {
			dp[i]=1;
			
			for(int j=0; j<i; j++) {
				
				if(A[i]>A[j]&&dp[i]<dp[j]+1) 
					dp[i] = dp[j]+1;
			}
		}
		
		// ÃÖ´ñ°ª(ÃÖ´ë ±æÀÌ) Å½»ö 
		int max = -1;
		for(int i = 0; i < N; i++) {
			max = dp[i] > max ? dp[i] : max;
		}
		System.out.println(max);
	}
}
