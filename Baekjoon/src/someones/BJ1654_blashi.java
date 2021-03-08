package someones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1654_blashi {
	public static void main(String[] args) throws IOException {
		// input
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int K = Integer.parseInt(st.nextToken()), N = Integer.parseInt(st.nextToken());
		long end = 0, start = 1, max = 0;
		long[] arr = new long[K];
		for(int i=0; i<K; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
			end = Math.max(arr[i], end);
		}
		
		//BS
		while(start <= end) {
			long mid = (start + end)/2, count = 0;
			for(int i =0; i< K; i++)
				count += arr[i]/mid;
			
			if(count >= N) {
				start = mid +1;
				max = Math.max(max, mid);
			} else 
				end = mid - 1;
		}
		
		// output
		System.out.println(max);
	}
}
