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

		// 첫번째 방법. 인접한 작은 값에서 +로 이동.
		int channel = n;
		while (channel > n - Math.abs(n - 100)) {
			if (channel >= 0) {
				// 고장난 숫자가 있다 = 숫자로 이동할 수 없다.
				if (unable(String.valueOf(channel), unable)) {
					channel--;
				} else {
					// 숫자로 이동할 수 있다면, 기존의 값과 숫자 이동 수 그리고 +이동 수의 합을 비교한다.
					ans = Math.min(ans, n - channel + String.valueOf(channel).length());
					break;
				}
				// 0까지 모두 탐색해도 숫자로 이동할 수 있는 채널이 없다. = 탐색 중지.
			} else {
				break;
			}
		}

		// 두번째 방법. 인접한 큰 값에서 -로 이동.
		channel = n + 1;
		while (channel < n + Math.abs(n - 100)) {
			// 고장난 숫자가 있다 = 숫자로 이동할 수 없다.
			if (unable(String.valueOf(channel), unable)) {
				channel++;
			} else {
				// 숫자로 이동할 수 있다면, 기존의 값과 숫자 이동 수 그리고 +이동 수의 합을 비교한다.
				ans = Math.min(ans, channel - n + String.valueOf(channel).length());
				break;
			}
		}

		System.out.println(ans);

	}

	// 입력값의 각 수를 확인하여 고장난 숫자가 하나라도 있을시 true를 반환.
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
