import java.util.Scanner;

//11054
//������� ���� : � �������� ����, ������ ��ο� ���� ���� �����ϴ� ����.
//���̸� ����ϹǷ� �̸� �����ؾ��Ѵ�.
public class LongestBitonicSequence {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		//dp[i] : i��° ���Ұ� �������϶� ������� ������ ����.
		int dp[] = new int[N];
		//up[i] : i��° ���ұ��� �������� ���� ����
		int up[] = new int[N];
		//down[i] : i��° ���ұ��� �������� ���� ����
		int down[] = new int[N];

		//A[i]�� ����. ��������.
		for(int i=0; i<N; i++) {
			up[i]=1;
			for(int j=0; j<i; j++) {
				if(A[j]<A[i]&&up[i]<up[j]+1) 
					up[i] = up[j]+1;
			}
		}

		//A[i]�� ����. ��������.
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
