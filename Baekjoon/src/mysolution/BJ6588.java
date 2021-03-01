package mysolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// ∞ÒµÂπŸ»Â¿« √ﬂ√¯
public class BJ6588 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			int k = Integer.parseInt(br.readLine());
			
			if(k==0)
				break;
			
			boolean isAble = false;
			for(int i=3; i<=k/2; i+=2) {
				if(isPrime(i)&&isPrime(k-i)) {
					sb.append(k+" = ").append(i+" + "+(k-i)).append('\n');
					isAble = true;
					break;
				}
			}
			if(!isAble) {
				sb.append("Goldbach's conjecture is wrong.").append('\n');
				isAble = false;
			}
		}
		
		System.out.println(sb);
	}
	public static boolean isPrime(int n) {
		for(int i =2; i<=Math.sqrt(n); i++) {
			if(n%i == 0)
				return false;
		}
		return true;
	}
}
