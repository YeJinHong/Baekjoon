package someones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ11047_iguv {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tokens[] = br.readLine().split(" ");
		int times = Integer.parseInt(tokens[0]);
		int value = Integer.parseInt(tokens[1]);
		int[] coin = new int[times];
		int count = 0;
		for(int i = times - 1; i >= 0; i--) {
			coin[i] = Integer.parseInt(br.readLine());
		}
		for(int i=0; i < times; i++) {
			if(value >= coin[i]) {
				count += value/coin[i];
				value %= coin[i];
			}
		}
		System.out.println(count);
	}
}
