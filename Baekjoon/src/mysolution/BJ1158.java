package mysolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.LinkedList;

public class BJ1158 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st  = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		LinkedList<Integer> link = new LinkedList<>();
		int tmp = 0;
		for(int i=1; i<n+1; i++) {
			link.add(i);
		}
		
		
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		while(n>1) {
			tmp = (tmp-1+k)%(n--);
			sb.append(link.get(tmp)).append(", ");
			link.remove(tmp);
		}
		sb.append(link.get(0)).append(">");
		
		System.out.print(sb);
	}
}
