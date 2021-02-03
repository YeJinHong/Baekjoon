import java.io.*;
import java.util.*;

public class BJ10815 {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int a[] = new int[n];
		StringTokenizer token = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<n; i++) {
			a[i] = Integer.parseInt(token.nextToken());
		}
		int m = Integer.parseInt(br.readLine());
		int b[] = new int[m];
		token = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<m; i++) {
			b[i] = Integer.parseInt(token.nextToken());
		}
		
		Arrays.sort(a);
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<m; i++) {
			sb.append(binarySearch(b[i], a)).append(" ");
		}
		System.out.print(sb);
	}
	
	public static int binarySearch(int iKey, int arr[]) {
		int mid;
		int left = 0;
		int right = arr.length-1;
		
		while(right >= left) {
			mid = (right+left)/2;
			
			if(iKey == arr[mid]) {
				return 1;
			}
			if(iKey<arr[mid]) {
				right = mid-1;
			} else {
				left = mid+1;
			}
		}
		return 0;
	}
	
}
