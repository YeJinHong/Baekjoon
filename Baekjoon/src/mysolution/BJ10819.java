package mysolution;

import java.util.Arrays;
import java.util.Scanner;

//차이를 최대로
//답 봄 - https://log-laboratory.tistory.com/122 
//재귀부분에서 아직도 이해가 안간다.
public class BJ10819 {
	static int n;
	static int[] arr;
	static int result;
	static int[] tArr;
	static boolean[] visited;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		visited = new boolean[n];
		tArr=new int[n]; // 각 순열 케이스를 담아줄 임시 저장소
		
		result = 0;
		solve(0);
		System.out.println(result);
	}
	private static void solve(int count) {
		if(count == n) {
			int sum = 0;
			for(int i : tArr)
				System.out.print(i+"\t");
			System.out.println();
			
			for(int i=0; i<n-1; i++) {
				sum += Math.abs(tArr[i] - tArr[i+1]);
			}
			result = Math.max(result, sum);
			return;
		}
		
		for(int i=0; i<n; i++) { // 각 순열 케이스 생성
			if(visited[i]) {
				continue;
			}
			visited[i] = true;
			tArr[count] = arr[i]; // 담는다.
			solve(count + 1); // 재귀로 그 다음 index 늘려간다.
			visited[i] = false; // 다 만들고 false로 해제
		}
	}
}
