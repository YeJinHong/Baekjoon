package mysolution;
import java.util.Scanner;

public class MostIncreasingSequence {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		int sum[] = new int[N];

		// ���� ������ ���� ���� ������ ������ ������, ���� sum[i]�� ����
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
		// �ִ� Ž��
		int max = -1;
		for (int i = 0; i < N; i++) {
			max = sum[i] > max ? sum[i] : max;
		}
		System.out.println(max);

	}
}
