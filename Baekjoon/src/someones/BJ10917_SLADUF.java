package someones;

import java.io.IOException;

// 미처 못 품.

public class BJ10917_SLADUF {
	public static void main(String[] args) throws IOException {
		int n = (int) (Math.random() * 20);
		int m = (int) (Math.random() * 40);
		

		System.out.println(n + " " + m);
		while (m-- > 0) {
			int y = (int) (Math.random() * n);
			int x = (int) (Math.random() * y);
			System.out.println(x + " " + y);
		}
	}
}
