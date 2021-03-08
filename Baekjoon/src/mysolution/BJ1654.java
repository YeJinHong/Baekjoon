package mysolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 랜선 자르기
// 재귀 함수 호출은 시간 초과 
// a+b/2와 a+(b-a)/2는 시간차이가 두 배
// 답 봄
public class BJ1654 {
	static int arr[];
	public static void main(String[] args) throws IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		arr = new int[k];

		int left = 1;
		int right = 0; // 최댓값
		for (int i = 0; i < k; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(right < arr[i])
				right = arr[i];
		}
			
		long length = getLength(left, right, n);
		System.out.println(length);		
	}

	// 길이가 length일때 각 랜선에서 나올 수 있는 랜선의 총량 반환.
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
