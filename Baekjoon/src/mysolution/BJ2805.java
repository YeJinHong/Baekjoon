package mysolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 나무 자르기
public class BJ2805 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int arr[] = new int[n];
		int sum = 0;
		for(int i = 0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sum += arr[i];
		}
		
		Arrays.sort(arr); // 사실상 불필요한 부분.

		int high = arr[n-1] - m/n; // 적당히 최댓값으로 설정해도 된다.
		int low = arr[0] - m/n;	 // 0으로 두어도 된다.
		int h = 0;

		while(high >= low) {
			long wood = 0;
			long mid = (high + low)/2;
			
			for(int i=0; i<n; i++) {
				if(arr[i] - mid > 0)
					wood += arr[i] - mid;
			}
			
			if(wood >= m) {
				h = (int) mid;
				low = (int) mid+1;
			} else
				high = (int)mid-1;
		}
		
		System.out.print(h);

	}
}
