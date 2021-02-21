package mysolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1373 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Long a = Long.parseLong(br.readLine(), 2);
		StringBuilder sb = new StringBuilder();
		while(a != 0) {
			long rest = a%8;
			if(rest >= 10) { //10넘어가면 알파벳으로 표기
				rest += 55;
				sb.insert(0, (char)(rest));
			}
			else {
				sb.insert(0, rest);
			}
			a/=8;
		}
		System.out.println(sb);
	}
}
