package mysolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1107 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int n = Integer.parseInt(s);
		int m = Integer.parseInt(br.readLine());
		boolean unable[] = new boolean[11];
		int ans = 0;
		if (m != 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < m; i++)
				unable[Integer.parseInt(st.nextToken())] = true;
		}
		
		if (n == 100) {
			System.out.println(ans);
			return;
		}

		ans = Math.abs(n - 100);
		if (m == 10) {
			System.out.println(ans);
			return;
		}

		// ù��° ���. ������ ���� ������ +�� �̵�.
		int channel = n;
		while (channel > n - Math.abs(n - 100)) {
			if (channel >= 0) {
				// ���峭 ���ڰ� �ִ� = ���ڷ� �̵��� �� ����.
				if (unable(String.valueOf(channel), unable)) {
					channel--;
				} else {
					// ���ڷ� �̵��� �� �ִٸ�, ������ ���� ���� �̵� �� �׸��� +�̵� ���� ���� ���Ѵ�.
					ans = Math.min(ans, n - channel + String.valueOf(channel).length());
					break;
				}
				// 0���� ��� Ž���ص� ���ڷ� �̵��� �� �ִ� ä���� ����. = Ž�� ����.
			} else {
				break;
			}
		}

		// �ι�° ���. ������ ū ������ -�� �̵�.
		channel = n + 1;
		while (channel < n + Math.abs(n - 100)) {
			// ���峭 ���ڰ� �ִ� = ���ڷ� �̵��� �� ����.
			if (unable(String.valueOf(channel), unable)) {
				channel++;
			} else {
				// ���ڷ� �̵��� �� �ִٸ�, ������ ���� ���� �̵� �� �׸��� +�̵� ���� ���� ���Ѵ�.
				ans = Math.min(ans, channel - n + String.valueOf(channel).length());
				break;
			}
		}

		System.out.println(ans);

	}

	// �Է°��� �� ���� Ȯ���Ͽ� ���峭 ���ڰ� �ϳ��� ������ true�� ��ȯ.
	static boolean unable(String s, boolean[] unable) {
		boolean b = false;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int n = c - 48;
			b = b | unable[n];
		}
		return b;
	}

}
