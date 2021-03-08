package mysolution;

import java.util.*;

// 공유기 설치
// 답봄
// 이분 탐색, 매개 변수 검색 알고리즘
// 마지막으로 설치한 곳 + 최대거리로 공유기 c개를 설치하는 것.
// 가능한 거리의 범위(min~max)를 구하고 이분 탐색으로 그 범위를 좁혀나가는 전형적인 방식.
// min = 1, max = 마지막 값 - 첫번째 값
// 배열의 가운데 값인 mid를 기준으로 공유기를 c 이상 설치가 가능한지 체크
// c이상 설치가 가능하다면 start = mid+1
// c이상 설치가 불가능하다면 end = mid-1
// 이런식으로 값의 범위를 좁혀가고 c이상 설치가 가능할 때의 mid 값들중 최대값을 출력하면 된다.
public class BJ2110 {
	static boolean check(int[] a, int dist, int c) {
		int cnt = 1;
		int last = a[0]+dist; // 첫 번째 값 + 거리
		for(int i=0; i < a.length; i++) {
			if(a[i] >= last) {
				cnt++;
				last = a[i] + dist; // 마지막 값 + 거리
			}
		}
		return cnt >= c;
	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int c = scan.nextInt();
		int a[] = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = scan.nextInt();
		}
		
		Arrays.sort(a);
		int ans = 1;
		int start = 1;
		int end = a[n-1]-a[0]; // 가능한 최대 거리

		while(start <= end) {
			int mid = (start + end)/2;
			if(check(a, mid, c)) {
				ans = Math.max(ans, mid);
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		
		System.out.println(ans);
	}
}
