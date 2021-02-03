import java.util.Scanner;
import java.lang.Math;

//2156
//정답 참조함
public class wine {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<1||n>10000)
			System.err.print("out of bound");
		
		int arr[] = new int[n+1];
		for(int i=1; i<n+1; i++) {
			arr[i] = sc.nextInt();
			if(arr[i]<0||arr[i]>1000)
				System.err.print("out of bound");
		}
		// 와인을 먹는 경우의 수 oox, oxo, xoo
		// oox : dp[i-1]
		// oxo : dp[i-2]+arr[i]
		// xoo : dp[i-3]+arr[i-1]+a[i]
		int dp[] = new int[n+1];
		dp[1] = arr[1];
		if(n>=2) {
			dp[2] = arr[1]+arr[2];
		}
		for(int i=3; i<n+1; i++) {
			int a = dp[i-1];
			int b = dp[i-2]+arr[i];
			int c = dp[i-3]+arr[i-1]+arr[i];
			
			dp[i] = a;
			if(b > dp[i])
				dp[i] = b;
			if(c > dp[i])
				dp[i] = c;
		}
		
		System.out.println(dp[n]);
	}
}
