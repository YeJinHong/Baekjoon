package mysolution;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 소수 찾기
public class BJ1978 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = N;
		for(int i=0; i<N; i++) {
			int n = Integer.parseInt(st.nextToken());
			if(n ==1)
				count--;
			for(int j=2; j<n; j++) {
				if(n%j == 0) {
					count--;
					break;
				}
			}
		}		
		System.out.println(count);		
	}
}
