package mysolution;

import java.io.*;
import java.util.*;

//�̺� �׷���
//�� ��.
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
					//���� ��忡 ����� ��带 �湮���� �ʾҴٸ�, ť�� �ִ´�.
					//ť : ������ �湮�� ��带 ������.
					if(visit[al[now].get(j)] == 0) {
						q.add(al[now].get(j));
					}
					
					//���� ��忡 ����� ��尡 ���� ���� ���� ���� �����ٸ�, NO�� ����Ѵ�.
					if(visit[al[now].get(j)] == visit[now]) {
						System.out.println("NO");
						return;
					}
					//���� ��� ���� 1�̰� ����� �ٸ� ��尡 ���� ���ٸ�, �ٸ� ��(2)�� �Ҵ��Ѵ�.
					if(visit[now] == 1 && visit[al[now].get(j)] == 0)
						visit[al[now].get(j)] = 2;
					//���� ��� ���� 2�̰� ����� �ٸ� ��尡 ���� ���ٸ�, �ٸ� ��(1)�� �Ҵ��Ѵ�.
					else if(visit[now] == 2 && visit[al[now].get(j)] == 0)
						visit[al[now].get(j)] = 1;
				}
			}
		}
		
		System.out.println("YES");
	}
}
