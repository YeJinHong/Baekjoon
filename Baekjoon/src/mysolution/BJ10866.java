package mysolution;

import java.io.*;
import java.util.*;

public class BJ10866 {
	static int deque[] = new int[20001];
	static int front = 10000;
	static int back = front-1;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s;
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		while(n-->0) {
			s = br.readLine();
			st = new StringTokenizer(s, "_| ");
			switch(st.nextToken()) {
				case "push":
					switch (st.nextToken()) {
					case "front":
						push_front(Integer.parseInt(st.nextToken()));
						break;
					case "back":
						push_back(Integer.parseInt(st.nextToken()));
						break;
					}
					break;
				case "pop":
					switch (st.nextToken()) {
					case "front":
						System.out.println(pop_front());
						break;
					case "back":
						System.out.println(pop_back());
						break;
					}
					break;
				case "size":
					System.out.println(size());
					break;
				case "empty":
					System.out.println(empty());
					break;
				case "front":
					System.out.println(front());
					break;
				case "back":
					System.out.println(back());
					break;
			}
		}
	}
	
	public static void push_front(int x) {
		deque[--front] = x;
	}
	public static void push_back(int x) {
		deque[++back] = x;
	}
	public static int pop_front() {
		if(front > back)
			return -1;
		int num = deque[front];
		deque[front++] = 0;
		return num;
	}
	public static int pop_back() {
		if(front > back)
			return -1;
		int num = deque[back];
		deque[back--] = 0;
		return num;
	}
	
	public static int size() {
		if(front > back)
			return 0;
		return back - front +1;
	}
	
	public static int empty() {
		if(front > back)
			return 1;
		return 0;
	}
	
	public static int front() {
		if(front > back)
			return -1;
		return deque[front];
	}
	
	public static int back() {
		if(front > back)
			return -1;
		return deque[back];
	}
}
