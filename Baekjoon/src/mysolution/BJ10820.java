package mysolution;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ10820 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		StringBuilder sb = new StringBuilder();
		
		while((s = br.readLine()) != null) {
			int result[] = new int[4];
			
			for(int i =0; i<s.length(); i++) {
				if(s.charAt(i) == ' ')
					result[3]++;
				else if(s.charAt(i)>=48 && s.charAt(i)<=57) 
					result[2]++;
				else if(s.charAt(i)>=65 && s.charAt(i)<=90)
					result[1]++;
				else if(s.charAt(i)>=97 && s.charAt(i)<=122)
					result[0]++;
			}
			
			for(int i=0; i<4; i++)
				sb.append(result[i]).append(" ");
			sb.append("\n");
		}
		
		System.out.print(sb);
	}
}
