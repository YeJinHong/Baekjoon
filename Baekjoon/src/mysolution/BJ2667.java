package mysolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

//������ȣ���̱�
public class BJ2667 {
	static int N, complex, sum;
	static char group[][];
	static int finished[][];
	static ArrayList<Integer> list;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		group = new char[N + 1][N + 1];
		finished = new int[N + 1][N + 1];
		list = new ArrayList<Integer>();

		for (int i = 1; i <= N; i++) {
			String line = br.readLine();
			for (int j = 1; j <= N; j++) {
				group[i][j] = line.charAt(j - 1);
			}
		}

		complex = 1;
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				sum = 0;

				// ���̰�, Ž������ �ʾҴٸ� ����� ���� Ȯ���Ѵ�.
				if (group[i][j] == '1' && finished[i][j] == 0) {
					solve(i, j);
					// solve�� ��������� ����� ��� ���� finished���� complex�� �ٲ۴�.
					complex++;
					// �̾��� ��� ���� Ž���� ��ġ�� ������ ���� �ϳ� �ø���.
				}

				if (sum != 0)
					list.add(sum);
			}
		}

		list.sort(null);
		
		System.out.println(complex-1);
		for (int i : list)
			System.out.println(i);
	}

	public static void solve(int a, int b) {

		// ���� �ƴϰų�, � ������ ���ԵǾ��ִٸ� Ž���� �����Ѵ�.
		if (group[a][b] == '0' || finished[a][b] != 0) {
			return;
		}

		if (finished[a][b] == 0) {
			finished[a][b] = complex;
			sum++;
			if (a > 1)
				solve(a - 1, b);
			if (a < N)
				solve(a + 1, b);
			if (b > 1)
				solve(a, b - 1);
			if (b < N)
				solve(a, b + 1);
		}
	}
}
