package sort;

//���� ������ �� ���Ҹ� �˻��Ͽ� �����ϴ� �˰���.
//���� �ð����⵵�� �׻� n(n-1)/2
//��ȯ�� �ð����⵵�� move*if = 3*n(n-1)/2

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
