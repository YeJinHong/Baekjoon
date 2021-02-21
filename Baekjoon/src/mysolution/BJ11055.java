package mysolution;
import java.util.Scanner;

//가장 큰 증가 부분 수열
public class BJ11055 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		int sum[] = new int[N];

		// 이전 수열의 값이 지금 수열의 값보다 작으며, 이전 sum[j]의 값이 현 위치 sum[i]값보다 클 때 선택.
		// 1 40 10 35 50
		// 1 2 2 3
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < i; j++) {
				if (A[j] < A[i] && sum[j] > sum[i]) {
					sum[i] = sum[j];
				}
			}
			sum[i] += A[i];

		}
		// 최댓값 탐색
		int max = -1;
		for (int i = 0; i < N; i++) {
			max = sum[i] > max ? sum[i] : max;
		}
		System.out.println(max);

	}
}
