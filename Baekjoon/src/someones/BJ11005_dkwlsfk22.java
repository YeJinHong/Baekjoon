package someones;

import java.io.*;

public class BJ11005_dkwlsfk22 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputs = br.readLine().split(" ");
		long N = Long.parseLong(inputs[0]);
		long B = Long.parseLong(inputs[1]);
		StringBuilder sb = new StringBuilder();
		while(N != 0) {
			long rest = N%B;
			if(rest >= 10) { //10넘어가면 알파벳으로 표기
				rest += 55;
				sb.insert(0, (char)(rest));
			}
			else {
				sb.insert(0, rest);
			}
			N/=B;
		}
		System.out.println(sb);
	}
}
