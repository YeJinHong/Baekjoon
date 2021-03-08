package mysolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// ��ȸ or ����
public class BJ2875 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int team = Math.max(n/2, m); // ������ ������� �ʾ��� �� ����� �ִ� �ִ� ���� ����
		int able = n + m - k;
		
		while(able < 3*team) {
			team--;
		}
		
		System.out.print(team);
	}
}
