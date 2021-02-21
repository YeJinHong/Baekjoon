package mysolution;

import java.io.*;

public class BJ2745 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(Long.parseLong("123", 16));
		
		String[] s = (br.readLine()).split(" ");
		String N = s[0];
		int K = Integer.parseInt(s[1]);
		int result = 0;
		
		for(int i=0; i<N.length(); i++) {
			char c = N.charAt(i);
			if(c >=  'A') {
				int temp = c-55;
				result += temp*(Math.pow(K, N.length()-i-1));
			}
			else {
				result += (c-48)*(Math.pow(K, N.length()-i-1));		
			}


		}
		
		System.out.print(result);
	}
}
