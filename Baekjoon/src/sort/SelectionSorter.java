package sort;

//���ڸ�(in-place sorting) �˰����� �ϳ�
//���� �ð����⵵�� n(n-1)/2
//��ȯ�� �ð����⵵�� �׻� 3(n-1)

public class SelectionSorter {
	public void selection_sort(int list[], int n) {
		int i, j, least, temp;
		
		for(i=0; i<n-1; i++) {
			least = i;
			
			for(j=i+1; j<n; j++) {
				if(list[j]<list[least])
					least = j;
			}
			
			if(i != least) {
				swap(list, i, j);
			}
		}
	}
	private static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}
