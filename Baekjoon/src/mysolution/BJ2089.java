package mysolution;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// -2����
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
		//������ ������ ������.
			int mok = 0; // ��
			int nmg = 0; // ������
			
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
