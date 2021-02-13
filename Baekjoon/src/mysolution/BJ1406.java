package mysolution;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

//���ذ�_�ð� �ʰ�
public class BJ1406 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder s = new StringBuilder(br.readLine());
		int cursor = s.length(); // �ʱ� Ŀ�� ��ġ
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
				s.deleteCharAt(--cursor);// �ð� ���⵵ O(n)
			}
			else if(c=='P') {
				s.insert(cursor++, command.charAt(2)); // �ð� ���⵵ O(n)
			}
		}

		bw.write(s.toString());
		bw.flush();
		br.close();
		bw.close();
		
	}
}
