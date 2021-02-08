package mysolution;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BJ10845 {
	public static void main(String[] args) throws IOException{
		int[] queue = new int[10000];
		int front=0, back =-1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		while(n-->0) {
			st = new StringTokenizer(br.readLine());
			switch(st.nextToken()) {
			case "push":
				queue[++back] = Integer.parseInt(st.nextToken());
				break;
			case "pop":
				if(queue[front]==0)
					System.out.println(-1);
				else {
					System.out.println(queue[front]);
					queue[front++] = 0;
				}
				break;
			case "size":
				System.out.println(back-front+1);
				break;
			case "empty":
				if(back-front+1<=0)
					System.out.println(1);
				else
					System.out.println(0);
				break;
			case "front":
				if(back-front+1<=0)
					System.out.println(-1);
				else
					System.out.println(queue[front]);
				break;
			case "back":
				if(back-front+1<=0)
					System.out.println(-1);
				else
					System.out.println(queue[back]);
				break;
			}
		}
	}
}
