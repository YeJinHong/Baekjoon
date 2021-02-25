package someones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2089_hyungang7 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		if(n==0) {
			System.out.println(0);
			return;
		}
		
		int[] arr = new int[100];
		int idx = -1;
		while(n != 1) {
			if(n < 0) {
				if((n*-1)%2 == 1) { // À½È¦
					n = n / -2 + 1;
					arr[++idx] = 1;					
				} else { // À½Â¦
					n = n / -2;
					arr[++idx] = 0;
				}
			} else {
				if(n % 2 == 1) { // ¾çÈ¦
					n = n / -2;
					arr[++idx] = 1;
				} else {
					n = n / -2;
					arr[++idx] = 0;
				}
			}
		}
		
		arr[++idx] = 1;
		for(int i = idx; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	}
}
