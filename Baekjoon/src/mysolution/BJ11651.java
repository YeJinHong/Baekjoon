package mysolution;
import java.io.*;
import java.util.*;

public class BJ11651 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[][] = new int[n][2];
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int e1[], int e2[]) {
				if(e1[1]==e2[1])
					return e1[0]-e2[0];
				else
					return e1[1]-e2[1];
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++) {
			sb.append(arr[i][0]).append(' ').append(arr[i][1]).append('\n');
		}
		System.out.println(sb);
	}
}
