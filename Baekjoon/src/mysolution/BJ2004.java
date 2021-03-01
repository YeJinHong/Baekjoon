package mysolution;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// ���� 0�� ����
// �ð� �ʰ�
public class BJ2004 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]); // �ִ� 20��
		int m = Integer.parseInt(s[1]);

		// ������ ������ ���� nCm = nCn-m
		if (m < n / 2)
			m = n - m;

		int num_five = 0; // ����(numerator)
		int num_two = 0;
		int den_five = 0; // �и�(denominator)
		int den_two = 0;
		// n*(n-1)*...*(m+1) ���� ���μ� 2�� �� ���ϱ�
		int i = (n / 2) * 2;
		while (i >= m + 1) {
			num_two += baseLog(i, 2);
			i -= 2;
		}

		// (n-m)!���� ���μ� 2�� �� ���ϱ�
		i = ((n - m) / 2) * 2;
		while (i >= 2) {
			den_two += baseLog(i, 2);
			i -= 2;
		}
		if (den_two == num_two) {
			bw.write(String.valueOf(0));
			return;
		} else {

			// n*(n-1)*...*(m+1) ���� ���μ� 5�� �� ���ϱ�
			i = (n / 5) * 5;
			while (i >= m + 1) {
				num_five += baseLog(i, 5);
				i -= 5;
			}

			// (n-m)!���� ���μ� 5�� �� ���ϱ�
			i = ((n - m) / 5) * 5;
			while (i >= 5) {
				den_five += baseLog(i, 5);
				i -= 5;
			}

			int den_ten = den_five > den_two ? den_two : den_five;
			int num_ten = num_five > num_two ? num_two : num_five;

			bw.write(String.valueOf(num_ten - den_ten));
		}

		bw.flush();
		br.close();
		bw.close();
	}

	public static double baseLog(double x, double base) {
		return Math.log(x) / Math.log(base);
	}
}
