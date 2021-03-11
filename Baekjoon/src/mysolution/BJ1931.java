package mysolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// 회의실 배정
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
			arr[i][2] = arr[i][1] - arr[i][0]; // 회의 시간
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

		// 회의 시작 시간이 같다면 끝내는 짧은 시간이 작은 것을 고르는 것이 최적.
		// 끝내는 시간이 t보다 짧고 회의 시간이 짧다면 i = arr[j] (회의 시간 후보)
		// 시작하는 시간이 t의 끝내는 시간보다 크다면 count++
		// t는 새로운 시작 시간으로 할당.
		// 마지막 스케줄은 직전 스케줄과 한번더 비교.
		int count = 0;
		int start = arr[0][0];
		int end = arr[0][1];
		int now = 0;
		
		for(int i= 1; i<n; i++) {
			// 후보 회의 시간 끝난 이후 회의라면 후보 회의를 확정(+)
			 if(end <= arr[i][0]) {
				count++;
				now = end;
				start = arr[i][0];
				end = arr[i][1];
			 }
			// 비교 시간이 후보 회의 시간보다 짧고
			// 후보 회의의 끝나는 시간이 비교 시간 보다 길다면
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
