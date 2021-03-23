package mysolution;

import java.io.*;
import java.util.*;

//이분 그래프
//답 봄.
//BFS
// https://jellyinghead.tistory.com/14
public class BJ1707 {
	static int v, e;
	static ArrayList<Integer>[] al;
	static int visit[];
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(stz.nextToken());
		
		for(int tc = 0; tc < t; tc++) {
			stz = new StringTokenizer(br.readLine());
			v = Integer.parseInt(stz.nextToken());
			e = Integer.parseInt(stz.nextToken());
			visit = new int[v+1];
			al = new ArrayList[v+1];
			
			for(int i=0; i <= v; i++)
				al[i] = new ArrayList<Integer>();
			
			for(int i=0; i<e; i++) {
				stz = new StringTokenizer(br.readLine());
				int p1 = Integer.parseInt(stz.nextToken());
				int p2 = Integer.parseInt(stz.nextToken());
				
				al[p1].add(p2);
				al[p2].add(p1);
			}
			grouping();
		}
	}
	
	public static void grouping() {
		Queue<Integer> q = new LinkedList<Integer>();
		
		for(int i = 1; i <= v; i++) {
			if(visit[i] == 0) {
				q.add(i);
				visit[i] = 1;
			}
			
			while(!q.isEmpty()) {
				int now = q.poll();
				
				for(int j=0; j < al[now].size(); j++) {
					//현재 노드에 연결된 노드를 방문하지 않았다면, 큐에 넣는다.
					//큐 : 다음에 방문할 노드를 저장함.
					if(visit[al[now].get(j)] == 0) {
						q.add(al[now].get(j));
					}
					
					//현재 노드에 연결된 노드가 현재 노드와 같은 값을 가진다면, NO를 출력한다.
					if(visit[al[now].get(j)] == visit[now]) {
						System.out.println("NO");
						return;
					}
					//현재 노드 값이 1이고 연결된 다른 노드가 값이 없다면, 다른 값(2)를 할당한다.
					if(visit[now] == 1 && visit[al[now].get(j)] == 0)
						visit[al[now].get(j)] = 2;
					//현재 노드 값이 2이고 연결된 다른 노드가 값이 없다면, 다른 값(1)을 할당한다.
					else if(visit[now] == 2 && visit[al[now].get(j)] == 0)
						visit[al[now].get(j)] = 1;
				}
			}
		}
		
		System.out.println("YES");
	}
}
