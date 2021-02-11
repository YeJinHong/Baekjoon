package mysolution;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ11655 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(br.readLine());
		for (int i = 0; i < sb.length(); i++) {
			char c = sb.charAt(0);
			if (c>=65 &&c <= 90) {
				if(c + 13 >= 91)
					sb.append((char)(c- 13));
				else
					sb.append((char)(c + 13));
			}
			else if(c >=97 && c <= 122 ) {
				if(c + 13 >= 123)
					sb.append((char)(c - 13));
				else
					sb.append((char)(c + 13));
			}
			else {
				sb.append((char)c);
			}
			sb.deleteCharAt(0);

		}
		
		System.out.print(sb);
	}
}
