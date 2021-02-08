package mysolution;
import java.io.*;
import java.util.StringTokenizer;

public class BJ10828 {
	static int stack[] = new int[10000];
	static int now = -1;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		String s; // ¸í·É¹®
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			s = st.nextToken();
			switch (s) {
			case "push":
				push(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				pop();
				break;
			case "size":
				size();
				break;
			case "empty":
				empty();
				break;
			case "top":
				top();
				break;
			}
		}
	}

	public static void push(int X) {
		stack[++now] = X;
	}

	public static void pop() throws IOException {
		if(now <= -1) {
			System.out.println(-1);
			return;
		}

		System.out.println(stack[now]);
		//bw.write(stack[now]+"\n");
		stack[now--] = 0;
	}

	public static void size() throws IOException {
		//bw.write(now+1+"\n");
		System.out.println(now+1);
	}

	public static void empty() throws IOException {
		//bw.write(now <= -1? 1+"\n" : 0+"\n");
		System.out.println(now <= -1? 1 : 0);
	}

	public static void top() throws IOException {
		//bw.write(now <= -1? -1+"\n" : stack[now]+"\n");
		System.out.println(now <= -1? -1 : stack[now]);
	}
}
