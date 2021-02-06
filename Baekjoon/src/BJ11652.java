import java.io.*;
import java.util.Arrays;

public class BJ11652 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long arr[] = new long[n];
		for(int i=0; i<n; i++) {
			arr[i] = Long.parseLong(br.readLine());
		}
		
		Arrays.parallelSort(arr);

		
		int k[] = new int[n];
		k[0] = 1;
		long num = arr[0];
		int max = k[0];
		for(int i=1; i<n; i++) {
			if(arr[i-1]==arr[i]) {
				k[i] = k[i-1]+1;
			}
			else {
				k[i] = 1;
				if(k[i-1]>max) {
					max = k[i-1];
					num = arr[i-1];
				}
			}
		}
		
		if(k[n-1]>max) {
			max = k[n-1];
			num = arr[n-1];
		}
		System.out.print(num);
	}
}
