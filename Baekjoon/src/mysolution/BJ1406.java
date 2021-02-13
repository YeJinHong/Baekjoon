package mysolution;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

//미해결_시간 초과
public class BJ1406 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder s = new StringBuilder(br.readLine());
		int cursor = s.length(); // 초기 커서 위치
		int m = Integer.parseInt(br.readLine());
		String command;
		
		while(m-->0) {
			command = br.readLine();
			char c = command.charAt(0);
			if(cursor>0&&c=='L') {
				cursor--;
			}
			else if(c=='D'&&cursor<s.length()) {
				cursor++;
			}
			else if(cursor>0&&c=='B') {
				s.deleteCharAt(--cursor);// 시간 복잡도 O(n)
			}
			else if(c=='P') {
				s.insert(cursor++, command.charAt(2)); // 시간 복잡도 O(n)
			}
		}

		bw.write(s.toString());
		bw.flush();
		br.close();
		bw.close();
		
	}
}
