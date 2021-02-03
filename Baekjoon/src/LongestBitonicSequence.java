import java.util.Scanner;

//11054
//바이토닉 수열 : 어떤 기준점의 왼쪽, 오른쪽 모두에 작은 값이 존재하는 형태.
//길이를 출력하므로 이를 저장해야한다.
public class LongestBitonicSequence {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		//dp[i] : i번째 원소가 기준점일때 바이토닉 수열의 길이.
		int dp[] = new int[N];
		//up[i] : i번째 원소까지 오름차순 수열 길이
		int up[] = new int[N];
		//down[i] : i번째 원소까지 내림차순 수열 길이
		int down[] = new int[N];

		//A[i]의 왼쪽. 오름차순.
		for(int i=0; i<N; i++) {
			up[i]=1;
			for(int j=0; j<i; j++) {
				if(A[j]<A[i]&&up[i]<up[j]+1) 
					up[i] = up[j]+1;
			}
		}

		//A[i]의 왼쪽. 내림차순.
		for(int i=N-1; i>=0; i--) {
			down[i]=1;
			for(int j=N-1; j>i; j--) {
				if(A[j]<A[i]&&down[i]<down[j]+1) 
					down[i] = down[j]+1;
			}
		}
		
		for(int i=0; i<N; i++) {
			dp[i] = up[i]+down[i]-1;
		}
		
		int max = -1;
		for(int i = 0; i < N; i++) {
			max = dp[i] > max ? dp[i] : max;
		}
		System.out.println(max);
		
	}
}
