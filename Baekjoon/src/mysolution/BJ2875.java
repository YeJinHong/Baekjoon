package mysolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 대회 or 인턴
public class BJ2875 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int team = Math.max(n/2, m); // 인턴을 고려하지 않았을 때 만들수 있는 최대 팀의 개수
		int able = n + m - k;
		
		while(able < 3*team) {
			team--;
		}
		
		System.out.print(team);
	}
}
