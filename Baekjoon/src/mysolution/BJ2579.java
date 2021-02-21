package mysolution;
import java.util.Scanner;

//��� ������
public class BJ2579 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int A[] = new int[n+1];
		for(int i=1; i<n+1; i++) {
			A[i] = sc.nextInt();
		}
		
		// xoo : dp[i] = dp[i-3]+A[i-1]+A[i]
		// oxo : dp[i] = dp[i-2]+A[i]
		
		// dp[i] : i���� �����ϴ� ��� ������ ����� �ְ��� 
		int dp[] = new int[n+1];
		dp[1] = A[1];
		if(n>=2)
			dp[2] = A[1]+A[2];
		for(int i=3; i<n+1; i++) {
			int a = dp[i-3]+A[i-1]+A[i];
			int b = dp[i-2]+A[i];
			
			dp[i] = a>b? a:b;
		}
		
		System.out.print(dp[n]);
		
	}
}
