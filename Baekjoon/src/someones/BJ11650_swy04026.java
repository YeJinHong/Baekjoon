package someones;
//다른 분의 코드를 연습해보는 package. 
//클래스 이름 구성은 BJ문제번호_아이디

import java.io.*;
import java.util.*;

//656ms
//Comparator 구성부분이 어려움.
public class BJ11650_swy04026 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		StringTokenizer token;
		int[][] arr = new int[n][2];
		//입력 받기
		for(int a=0; a<n; a++) {
			token = new StringTokenizer(br.readLine(), " ");
			arr[a][0] = Integer.parseInt(token.nextToken());
			arr[a][1] = Integer.parseInt(token.nextToken());
		}
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] e1, int[] e2) {
				//첫번째 원소가 같다면 두 번째 원소끼리 비교
				if(e1[0] == e2[0]) {
					return e1[1] - e2[1];					
				}
				else {
					return e1[0] - e2[0];
				}
			}
		});
		
		for(int i=0; i<n; i++) {
			sb.append(arr[i][0]).append(' ').append(arr[i][1]).append('\n');
		}
		System.out.println(sb);
	}
}
