package someones;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BJ6588_sumini0715 {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		PrimeNum pn = new PrimeNum();
		
		try {
			while(true) {
				int num = Integer.parseInt(br.readLine());
				if(num == 0)
					break;
				else {
					int a =pn.find_goldbach(num);
					if(a == -1) {
						sb.append("Goldbach's conjecture is wrong.\n");
					}
					else {
						sb.append(num).append(" = ").append(a).append(" + ").append(num - a).append('\n');
					}
				}
			}
			
			bw.write(sb.toString());
			bw.close();
			bw.close();
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
class PrimeNum {
	boolean[] check = new boolean[1000000];
	
	PrimeNum() {
		find_prime();
	}
	
	void find_prime() {
		for(int i=3; i*i < 1000000; i += 2) {
			if(!check[i]) {
				for(int j=i*i; j<1000000; j += (2*i)) {
					check[j] = true;
				}
			}
		}
	}
	
	int find_goldbach(int n) {
		for(int i = 3; i <= n/2; i += 2) {
			if(!check[i]) {
				if(!check[n-1]) {
					return i;
				}
			}
		}
		return -1;
	}
}
