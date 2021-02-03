package someones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//692ms
//람다식은 코드를 간결하게 하지만 미세하게 시간에 영향을 주는 듯하다.
public class BJ11650_lms0806 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		int[][] num = new int[size][2];
		
		StringTokenizer st;
		for(int i=0; i<size; i++) {
			st = new StringTokenizer(br.readLine());
			num[i][0] = Integer.parseInt(st.nextToken());
			num[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(num, (x,y)->{
			if(x[0]==y[0]) {
				return x[1]-y[1];
			}
			else {
				return x[0]-y[0];
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<size; i++) {
			sb.append(num[i][0]).append(" ").append(num[i][1]).append("\n");
		}
		System.out.println(sb);
	}
}
