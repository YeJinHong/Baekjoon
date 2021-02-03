package sort;

//서로 인접한 두 원소를 검사하여 정렬하는 알고리즘.
//비교의 시간복잡도는 항상 n(n-1)/2
//교환의 시간복잡도는 move*if = 3*n(n-1)/2

public class BubbleSorter {
	public void bubble_sort(int list[], int n) {
		int i, j, temp;
		
		for(i=n-1; i>0; i--) {
			for(j=0; j<i; j++) {
				if(list[j]<list[j+1]) {
					swap(list, j, j+1);
				}
			}
		}
	}
	private static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}
