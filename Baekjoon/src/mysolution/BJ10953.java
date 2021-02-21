package mysolution;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

//A+B - 6
public class BJ10953 {
	public static void main(String[] args) throws IOException {
		BufferedReader bsr = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bsr.readLine());
		int A;
		int B;
		StringTokenizer str;
		while (T > 0) {
			str = new StringTokenizer(bsr.readLine(), ",", false);
			A = Integer.parseInt(str.nextToken());
			B = Integer.parseInt(str.nextToken());
			if (A < 0 || B > 10)
				System.err.println("out of bound");
			System.out.println(A + B);
			T--;
		}
		bsr.close();
	}
	
}
