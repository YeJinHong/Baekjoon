package someones;

import java.io.*;

public class BJ10989_youdong98 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int []count = new int[10001];
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(br.readLine());
			count[num]++;
		}
		
		for(int i=1; i<10001; i++) {
			bw.write((i+"\n").repeat(count[i]));
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}
