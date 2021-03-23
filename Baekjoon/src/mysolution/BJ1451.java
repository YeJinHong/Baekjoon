package mysolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//직사각형으로 나누기
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
			else { // n==2, m==2인 경우
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

	// 가로로만 3등분
	static long case1(int n, int m, int[][] arr) {

		long result = 0;

		// i와 j는 A,B,C 세 영역의 분기점
		for (int i = 1; i < m - 1; i++) {
			for (int j = i + 1; j < m; j++) {
				long A = 0;
				long B = 0;
				long C = 0;

				// 세로 줄 덧셈
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

	// 세로로만 3등분
	static long case2(int n, int m, int[][] arr) {
		long result = 0;

		// i는 가로줄의 분기점
		for (int i = 1; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				long A = 0;
				long B = 0;
				long C = 0;

				// 가로 줄 덧셈
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

	// 윗 방향 가로줄, 나머지 세로 이등분
	static long case3(int n, int m, int[][] arr) {
		long result = 0;
		// 각각 ㅜ, ㅏ, ㅓ, ㅗ 모양으로 등분되었을때 합의 곱.
		// 직사각형이 i와 j로 4등분 되었을 때 각각의 면적의 합을 A,B,C,D로 지정한다.
		// 각 면적의 합은 최대(약간의 비약으로) 90000으로 int범위 내 이지만,
		// 최종 합의 곱 계산시 overflow가 일어나므로 long으로 설정한다.
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
				c1 = (A + B) * C * D; // ㅜ모양
				c2 = (A + C) * B * D; // ㅏ모양
				c3 = A * C * (B + D); // ㅓ모양
				c4 = A * B * (C + D); // ㅗ모양

				long tmp = Math.max(Math.max(c1, c2), Math.max(c3, c4)); // 그 중 제일 큰 값.
				result = Math.max(result, tmp); // 역대 가장 큰 값.
			}
		}
		return result;
	}
}
