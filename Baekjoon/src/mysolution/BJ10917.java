package mysolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BJ10917 {
	static int n;
	static int m;
	static int result;
	static int length;
	static boolean flag;
	static PriorityQueue<Integer> edge[];

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		length = 0;
		result = m;
		edge = new PriorityQueue[n + 1];
		flag = false; // �߰��ߴ°�?
		// ū ���� �켱������ ����.���� ū ������ Ž���ϱ� ����.
		for (int i = 0; i < n + 1; i++)
			edge[i] = new PriorityQueue(Collections.reverseOrder());

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			edge[a].add(b);
		}

		solve(1);
		if (!flag)
			System.out.println(-1); // n�� �������� ����
		else
			System.out.println(result); // n�� ������.
	}

	private static void solve(int node) {
		// ������ ū ���� �Ű� ���� n�� �߰ߵǸ� �ٷ� ����
		// ���� ����� �ڽĳ�忡 n�� �ִٸ� ���̸� �����ϰ� �����Ѵ�.
		// ���� ����� �ڽĳ�忡 n�� ���ٸ� �ٸ� ����� �ڽĳ�带 Ȯ���Ѵ�.
		// ��Ʈ���� ��� �ڽ� ��忡 n�� ���ٸ� �ڽĳ�带 ���������� �湮�Ͽ� n�� �ִ��� Ȯ���Ѵ�.
		if (edge[node].contains(n)) {
			flag = true;
			result = ++length;
			return;
		}
		
		PriorityQueue<Integer> queue = new PriorityQueue();
		for (int j = n; j >= node + 1; j--) {
			// �ڽĳ�� �湮 �Ұ�
			if (!edge[node].contains(j))
				return;
			// �湮 ���� �ڽĳ�� ����.
			queue.add(j);
		}
		
		while(!queue.isEmpty()) {
			int k = queue.poll();
			if(edge[k].contains(n)) {
				flag = true;
				result = ++length;
				return;
			}
		}
		

	}
}
