package someones;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ10809_cheadev {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		StringBuilder s = new StringBuilder();
		for(int i=97; i < 123; i++) {
			s.append(S.indexOf(i)).append(" ");
		}
		System.out.println(s);
	}
}
