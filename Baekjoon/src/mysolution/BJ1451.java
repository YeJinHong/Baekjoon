package mysolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//���簢������ ������
public class BJ1451 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] arr = new int[n][m];
		String s;
		for (int i = 0; i < n; i++) {
			s = br.readLine();
			for (int j = 0; j < m; j++)
				arr[i][j] = s.charAt(j) - 48;
		}

		long ans = 0;

		if (n < 3 && m < 3) {
			if (n == 1)
				ans = case1(n, m, arr);
			else if (m == 1)
				ans = case2(n, m, arr);
			else { // n==2, m==2�� ���
				ans = case3(n, m, arr);
			}
		} else {
			long a = case1(n, m, arr);
			long b = case2(n, m, arr);
			long c = case3(n, m, arr);

			ans = Math.max(a, b);
			ans = Math.max(ans, c);
		}

		System.out.println(ans);
	}

	// ���ηθ� 3���
	static long case1(int n, int m, int[][] arr) {

		long result = 0;

		// i�� j�� A,B,C �� ������ �б���
		for (int i = 1; i < m - 1; i++) {
			for (int j = i + 1; j < m; j++) {
				long A = 0;
				long B = 0;
				long C = 0;

				// ���� �� ����
				for (int h = 0; h < n; h++) {
					for (int a = 0; a < i; a++) {
						A += arr[h][a];
					}

					for (int b = i; b < j; b++) {
						B += arr[h][b];
					}

					for (int c = j; c < m; c++) {
						C += arr[h][c];
					}
				}

				result = Math.max(result, A * B * C);
			}
		}

		return result;
	}

	// ���ηθ� 3���
	static long case2(int n, int m, int[][] arr) {
		long result = 0;

		// i�� �������� �б���
		for (int i = 1; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				long A = 0;
				long B = 0;
				long C = 0;

				// ���� �� ����
				for (int w = 0; w < m; w++) {
					for (int a = 0; a < i; a++) {
						A += arr[a][w];
					}

					for (int b = i; b < j; b++) {
						B += arr[b][w];
					}

					for (int c = j; c < n; c++) {
						C += arr[c][w];
					}
				}
				
				result = Math.max(result, A * B * C);
			}
		}

		return result;
	}

	// �� ���� ������, ������ ���� �̵��
	static long case3(int n, int m, int[][] arr) {
		long result = 0;
		// ���� ��, ��, ��, �� ������� ��еǾ����� ���� ��.
		// ���簢���� i�� j�� 4��� �Ǿ��� �� ������ ������ ���� A,B,C,D�� �����Ѵ�.
		// �� ������ ���� �ִ�(�ణ�� �������) 90000���� int���� �� ������,
		// ���� ���� �� ���� overflow�� �Ͼ�Ƿ� long���� �����Ѵ�.
		/*       j
		 *    -------
		 *   | A | B |
		 *  i -------
		 *   | C | D |
		 *    -------
		 */

		for (int i = 1; i < n; i++) {
			for (int j = 1; j < m; j++) {

				long c1 = 0, c2 = 0, c3 = 0, c4 = 0;
				long A = 0, B = 0, C = 0, D = 0;
				
				for (int h = 0; h < i; h++)
					for (int w = 0; w < j; w++)
						A += arr[h][w];

				for (int h = 0; h < i; h++)
					for (int w = j; w < m; w++)
						B += arr[h][w];

				for (int h = i; h < n; h++)
					for (int w = 0; w < j; w++)
						C += arr[h][w];

				for (int h = i; h < n; h++)
					for (int w = j; w < m; w++)
						D += arr[h][w];
				c1 = (A + B) * C * D; // �̸��
				c2 = (A + C) * B * D; // �����
				c3 = A * C * (B + D); // �ø��
				c4 = A * B * (C + D); // �Ǹ��

				long tmp = Math.max(Math.max(c1, c2), Math.max(c3, c4)); // �� �� ���� ū ��.
				result = Math.max(result, tmp); // ���� ���� ū ��.
			}
		}
		return result;
	}
}
