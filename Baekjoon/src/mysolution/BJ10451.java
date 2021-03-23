package mysolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ10451 {
	static ArrayList<Integer> arr;
	static int t, n;
	static boolean visited[];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
			n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr = new ArrayList();
			visited = new boolean[n+1];
			for(int i=0; i<n; i++) {
				arr.add(Integer.parseInt(st.nextToken()));
			}	
			
			solve();
		}
	}
	
	public static void solve() {
		int count = 0;
		for(int i=1; i<=n; i++) {
			if(visited[i]) {
				continue;
			}
			
			visited[i] = true;
			int now = i;
			while(arr.get(now-1) != i) {
				now = arr.get(now-1);
				visited[now] = true;
			}
			count++;
		}
		
		System.out.println(count);
	}
}
