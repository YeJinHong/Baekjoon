package sort;

//손 안의 카드를 정렬하는 방법과 유사
//앞에서부터 차례대로 이미 정렬된 배열 부분과 비교하여, 자신의 위치를 찾아 삽입.
public class InsertionSorter {
	public static void insertion_sort(int list[], int n) {
		int i, j, key;
		
		for(i=1; i<n; i++) {
			key = list[i];
			
			for(j=i-1; j>=0 && list[j]>key; j--) {
				list[j+1] = list[j];
			}
			
			list[j+1] = key;
		}
	}
	
	public static void main(String args[]) {
		int a[] = {10,8,7,6,5,3};
		insertion_sort(a, 6);
		for(int i=0; i<a.length; i++)
			System.out.println(a[i]);
		
	}
}
