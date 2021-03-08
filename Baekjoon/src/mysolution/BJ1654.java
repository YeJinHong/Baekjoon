package mysolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// ���� �ڸ���
// ��� �Լ� ȣ���� �ð� �ʰ� 
// a+b/2�� a+(b-a)/2�� �ð����̰� �� ��
// �� ��
public class BJ1654 {
	static int arr[];
	public static void main(String[] args) throws IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		arr = new int[k];

		int left = 1;
		int right = 0; // �ִ�
		for (int i = 0; i < k; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(right < arr[i])
				right = arr[i];
		}
			
		long length = getLength(left, right, n);
		System.out.println(length);		
	}

	// ���̰� length�϶� �� �������� ���� �� �ִ� ������ �ѷ� ��ȯ.
	public static long getCount(long length) {
		long count = 0;
		for (int i = 0; i < arr.length; i++) {
			count += arr[i] / length;
		}
		return count;
	}
	
	public static long getLength(long left, long right, int n) {
		long max = 0;
		
		while(right >= left) {
			long mid = (left + right)/2;
			long cnt = getCount(mid);
			
			if(cnt >= n) {
				max = mid;
				left = mid + 1;
			} else {
				right = mid -1; 
			}
		}
		return max;
	}
}
