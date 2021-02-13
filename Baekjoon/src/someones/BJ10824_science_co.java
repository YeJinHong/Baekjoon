package someones;

import java.io.*;

public class BJ10824_science_co {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] num = br.readLine().split(" ");
		long a = Long.parseLong(String.join(" ", num[0], num[1]));
		long b = Long.parseLong(String.join(" ", num[2], num[3]));
		System.out.println(a+b);
	}
}
