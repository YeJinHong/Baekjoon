package mysolution;

import java.io.*;

public class BJ11005 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = (br.readLine()).split(" ");
		int n = Integer.parseInt(s[0]);
		int k = Integer.parseInt(s[1]);
		StringBuilder sb = new StringBuilder();
		
		while(n>0) {
			if(n%k>=10) {
				sb.append((char)(n%k+55));
			}else {
				sb.append(n%k);	
			}
			n = n/k;
		}
		sb.reverse();
		System.out.println(sb);
	}
}
