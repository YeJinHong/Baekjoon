package someones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ10799_wbjkwjj {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int q = 0;
		int ans = 0;
		int i = 0;
		String steel = bf.readLine();
		int l = steel.length();
		while(i<l) {
			if(steel.charAt(i)=='('&&steel.charAt(i+1)==')') {
				ans += q;
				i += 1;
			}
			else if(steel.charAt(i)=='(') {
				q += 1;
			}
			else {
				q -= 1;
				ans += 1;
			}
			i+=1;
		}
		System.out.println(ans);
	}
}
