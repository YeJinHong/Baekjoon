package someones;

import java.io.*;
public class BJ9012_jjangman821 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		for(int i=0; i<N; ++i) {
			String input = br.readLine();
			
			int cnt = 0;
			for(int j=0; j<input.length(); ++j) {
				if(input.charAt(j)=='(') {
					++cnt;
				}
				else {
					--cnt;
				}
				if(cnt < 0) break;
			}
			
			if(cnt==0) {
				sb.append("YES");
			}
			
			else {
				sb.append("NO");
			}
			sb.append('\n');
		}
		
		System.out.println(sb);
	}
}
