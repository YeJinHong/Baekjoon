package mysolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1373 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringBuilder sb = new StringBuilder();
		
		for(int i=s.length(); i-3>=0;i= i-3) {
			String sub = s.substring(i-3, i);
			int n = Integer.parseInt(sub, 2);
			sb.append(n);
		}
		if(s.length()%3 !=0)
			sb.append(Integer.parseInt(s.substring(0, s.length()%3), 2));
		sb.reverse();
		
		System.out.println(sb);
	}
}
