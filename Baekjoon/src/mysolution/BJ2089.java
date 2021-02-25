package mysolution;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// -2Áø¼ö
public class BJ2089 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		if(N==0) {
			System.out.print(0);
			return;
		}
		while(N != 0) {
		//°ü°ÇÀº À½¼öÀÇ ³ª´°¼À.
			int mok = 0; // ¸ò
			int nmg = 0; // ³ª¸ÓÁö
			
			if(N>0||N%-2==0) {
				mok = N/-2;
				nmg = N%-2;
			} else {
					mok = N/-2 + 1;
					nmg = N - (mok*-2);
			}
			
			sb.append(nmg);
			N = mok;
			
		}
		
		sb.reverse();
		
		System.out.print(sb);
	}
}
