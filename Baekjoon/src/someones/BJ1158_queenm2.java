package someones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BJ1158_queenm2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		ArrayList<Integer> arr = new ArrayList<Integer>();
		//1~N »ðÀÔ
		for(int i=1; i<=N; i++) {
			arr.add(i);
		}
		int idx = K-1;
		
		sb.append("<");
		while(arr.size() != 1) {
			int out = arr.remove(idx);
			sb.append(out);
			sb.append(", ");
			idx = (idx + K-1)%arr.size();
		}
		sb.append(arr.get(0));
		sb.append(">");
		System.out.println(sb);
	}
}
