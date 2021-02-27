package someones;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ11653_tprud9412 {
	public static void main(String args[]) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			StringBuilder sb = new StringBuilder();
			int N = Integer.parseInt(br.readLine());
			
			for(int i=2; i<= Math.sqrt(N); i++) {
				while(N%i==0) {
					sb.append(i).append('\n');
					N /= i;
				}
			}
			if(N != 1) {
				sb.append(N);
			}
			
			System.out.println(sb);
			
		} catch(Exception e) {
			System.out.println("잘못된 입력 형식");
		}
	}

}
