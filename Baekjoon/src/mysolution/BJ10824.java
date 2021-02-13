package mysolution;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;


public class BJ10824 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String s1 = st.nextToken() + st.nextToken();
		String s2 = st.nextToken() + st.nextToken();
		
		System.out.print(Long.parseLong(s1)+Long.parseLong(s2));
	}
}
