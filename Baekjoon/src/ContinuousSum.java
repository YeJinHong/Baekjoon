import java.util.Scanner;

//1912
//�������� ���� ū ���� ���� ����.
public class ContinuousSum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int A[] = new int[n+1];
		for(int i=1; i<n+1; i++) {
			A[i] = sc.nextInt();
		}
		//dp[i] : ���� chunk���� ����. �̰� ���� ���� ���պ��� ���� Ŀ���� ���� ���� ���� ���� ���Ѱ��� ����.
		int dp[] = new int[n];
		for(int i=1; i<n+1; i++) {
			
			if(dp[i-1] > 0 &&dp[i]+dp[i-1]>0) {
				dp[i] += dp[i-1];
			}
			
			
		}
		
	}
}
