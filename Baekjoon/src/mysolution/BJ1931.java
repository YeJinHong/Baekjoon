package mysolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// ȸ�ǽ� ����
public class BJ1931 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[][] = new int[n][3];
		int last = 0;

		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			arr[i][2] = arr[i][1] - arr[i][0]; // ȸ�� �ð�
			if(arr[i][0] > last)
				last = arr[i][0];
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] e1, int[] e2) {
				// TODO Auto-generated method stub
				if(e1[0] - e2[0] == 0)
					return e1[2] - e2[2];
				else
					return  e1[0] - e2[0];
			}
			
		});

		// ȸ�� ���� �ð��� ���ٸ� ������ ª�� �ð��� ���� ���� ���� ���� ����.
		// ������ �ð��� t���� ª�� ȸ�� �ð��� ª�ٸ� i = arr[j] (ȸ�� �ð� �ĺ�)
		// �����ϴ� �ð��� t�� ������ �ð����� ũ�ٸ� count++
		// t�� ���ο� ���� �ð����� �Ҵ�.
		// ������ �������� ���� �����ٰ� �ѹ��� ��.
		int count = 0;
		int start = arr[0][0];
		int end = arr[0][1];
		int now = 0;
		
		for(int i= 1; i<n; i++) {
			// �ĺ� ȸ�� �ð� ���� ���� ȸ�Ƕ�� �ĺ� ȸ�Ǹ� Ȯ��(+)
			 if(end <= arr[i][0]) {
				count++;
				now = end;
				start = arr[i][0];
				end = arr[i][1];
			 }
			// �� �ð��� �ĺ� ȸ�� �ð����� ª��
			// �ĺ� ȸ���� ������ �ð��� �� �ð� ���� ��ٸ�
			 else if(end-start >= arr[i][2] && end > arr[i][1]) {
				start = arr[i][0];
				end = arr[i][1];
			}
			
		}
		if(now <= arr[n-1][0]) {
			count++;
			now = arr[n-1][1];
		}
		
		
		System.out.println(count);

	}
}
