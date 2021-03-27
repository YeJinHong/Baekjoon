package mysolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

//단지번호붙이기
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

				// 집이고, 탐색하지 않았다면 연결된 집을 확인한다.
				if (group[i][j] == '1' && finished[i][j] == 0) {
					solve(i, j);
					// solve는 재귀적으로 연결된 모든 집의 finished값을 complex로 바꾼다.
					complex++;
					// 이어진 모든 집의 탐색을 마치면 단지의 값을 하나 올린다.
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

		// 집이 아니거나, 어떤 단지에 포함되어있다면 탐색을 중지한다.
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
