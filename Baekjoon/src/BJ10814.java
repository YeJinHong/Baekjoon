import java.io.*;
import java.util.*;

public class BJ10814 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String arr[][] = new String[n][2];
		for(int i=0; i<n; i++) {
			StringTokenizer token = new StringTokenizer(br.readLine()," ");
			arr[i][0] = token.nextToken();
			arr[i][1] = token.nextToken();
		}
		
		//insertion_sort(arr, n);
		Merge_sort2 ms = new Merge_sort2();
		ms.input(n);
		ms.merge_sort(arr, 0, n-1);
		
		for(int i=0; i<n; i++) {
			System.out.println(arr[i][0]+" "+arr[i][1]);
		}
		
	}
	//시간초과
	public static void insertion_sort(String list[][], int n) {
		int i, j;
		String key1, key2;

		for (i = 1; i < n; i++) {
			key1 = list[i][0];
			key2 = list[i][1];

			for (j = i - 1; j >= 0; j--) {
				if (Integer.parseInt(list[j][0]) <= Integer.parseInt(key1)) {
					break;
				} else {
					list[j + 1][0] = list[j][0];
					list[j + 1][1] = list[j][1];
				}
			}
			list[j + 1][0] = key1;
			list[j + 1][1] = key2;
		}
	}
}
class Merge_sort2 {

	String sorted[][];
	public void input(int N) {
		 sorted = new String[N][2];
	}
	//변형된 합병 정렬 - 시간 초과
	public void merge(String list[][], int left, int mid, int right) {
		int i, j, k, l;
		//list랑 같은 크기의 배열 설정
		i = left;
		j = mid + 1;
		k = left;

		// 분할 정렬된 list의 합병
		while (i <= mid && j <= right) {
			if (Integer.parseInt(list[i][0]) <= Integer.parseInt(list[j][0]))
				sorted[k++] = list[i++];
			else
				sorted[k++] = list[j++];
		}

		// 남아 있는 값(우측)들을 일괄 복사
		if (i > mid) {
			for (l = j; l <= right; l++)
				sorted[k++] = list[l];
		}

		else {
			for (l = i; l <= mid; l++)
				sorted[k++] = list[l];
		}

		// 배열 sorted[](임시 배열)의 리스트를 배열 list[]로 재복사
		for (l = left; l <= right; l++)
			list[l] = sorted[l];
	}

	public void merge_sort(String list[][], int left, int right) {
		int mid;

		if (left < right) {
			mid = (left + right) / 2; // 중간 위치 계산, 리스트를 균등 분할
			merge_sort(list, left, mid); // 앞 리스트 정렬
			merge_sort(list, mid + 1, right); // 뒤 리스트 정렬
			merge(list, left, mid, right); // 정렬된 2개의 부분 리스트 합병
		}
	}

}