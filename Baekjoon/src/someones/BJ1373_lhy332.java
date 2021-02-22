package someones;

import java.io.*;

public class BJ1373_lhy332 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb = new StringBuilder();
		String input = br.readLine();
		int length = input.length();
		
		if(length%3 == 1) {
			sb.append(input.charAt(0)-'0');
		} else if(length%3==2) {
			sb.append((input.charAt(0)-'0')*2 + (input.charAt(1)-'0'));
		}
		
		for(int i = length%3; i<length; i = i+3) {
			sb.append((input.charAt(i)-'0')*4+(input.charAt(i+1)-'0')*2+(input.charAt(i+2)-'0'));
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
