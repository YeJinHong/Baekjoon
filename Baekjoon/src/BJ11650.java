
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.BufferedReader;

//xy페어이기 때문에 정렬시 함께 정렬하거나, 두개씩 묶을수있는 자료구조를 사용해야함.
public class BJ11650 {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int xy[][] = new int[N][2];

		// xy[0][i-1] = xi, xy[1][i-1] = yi
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			xy[i][0] = Integer.parseInt(st.nextToken());
			xy[i][1] = Integer.parseInt(st.nextToken());
		}

		Merge_sort ms = new Merge_sort();
		ms.input(N);
		ms.merge_sort(xy, 0, N-1);

		for (int i = 0; i < N; i++) {
			System.out.println(xy[i][0] + " " + xy[i][1]);
		}
	}

	// 변형된 삽입 정렬 - 시간 초과
	public static void insertion_sort(int list[][], int n) {
		int i, j, key1, key2;

		for (i = 1; i < n; i++) {
			key1 = list[0][i];
			key2 = list[1][i];

			for (j = i - 1; j >= 0; j--) {
				if (list[0][j] < key1 || list[0][j] == key1 && list[1][j] <= key2) {
					break;
				} else {
					list[0][j + 1] = list[0][j];
					list[1][j + 1] = list[1][j];
				}
			}
			list[0][j + 1] = key1;
			list[1][j + 1] = key2;
		}
	}
	

}
class Merge_sort {

	int sorted[][];
	public void input(int N) {
		 sorted = new int[N][2];
	}
	//변형된 합병 정렬 - 시간 초과
	public void merge(int list[][], int left, int mid, int right) {
		int i, j, k, l;
		//list랑 같은 크기의 배열 설정
		i = left;
		j = mid + 1;
		k = left;

		// 분할 정렬된 list의 합병
		while (i <= mid && j <= right) {
			if (list[i][0] < list[j][0]||list[i][0]==list[j][0]&&list[i][1]<list[j][1])
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

	public void merge_sort(int list[][], int left, int right) {
		int mid;

		if (left < right) {
			mid = (left + right) / 2; // 중간 위치 계산, 리스트를 균등 분할
			merge_sort(list, left, mid); // 앞 리스트 정렬
			merge_sort(list, mid + 1, right); // 뒤 리스트 정렬
			merge(list, left, mid, right); // 정렬된 2개의 부분 리스트 합병
		}
	}

}
