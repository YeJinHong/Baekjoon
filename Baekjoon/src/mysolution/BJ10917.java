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
		flag = false; // 발견했는가?
		// 큰 숫자 우선순위로 삽입.값이 큰 노드부터 탐색하기 위함.
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
			System.out.println(-1); // n에 도달하지 못함
		else
			System.out.println(result); // n에 도달함.
	}

	private static void solve(int node) {
		// 무조건 큰 수로 옮겨 가서 n이 발견되면 바로 정지
		// 현재 노드의 자식노드에 n이 있다면 길이를 저장하고 정지한다.
		// 현재 노드의 자식노드에 n이 없다면 다른 노드의 자식노드를 확인한다.
		// 루트노드는 모든 자식 노드에 n이 없다면 자식노드를 순차적으로 방문하여 n이 있는지 확인한다.
		if (edge[node].contains(n)) {
			flag = true;
			result = ++length;
			return;
		}
		
		PriorityQueue<Integer> queue = new PriorityQueue();
		for (int j = n; j >= node + 1; j--) {
			// 자식노드 방문 불가
			if (!edge[node].contains(j))
				return;
			// 방문 가능 자식노드 저장.
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
