package sort;

// �� : ���� ���� Ʈ���� ����, �켱���� ť�� ���Ͽ� ������� �ڷᱸ��.
// �ִ� �� : �θ����� ���� �ڽĳ���� ������ �׻� ū ��
// �ּ� �� : �θ����� ���� �ڽĳ���� ������ �׻� ���� ��
// �ð����⵵ : O(nlogn)
/* �ܰ�
 * 1. �ִ� ���� �����Ѵ�.
 * 2. ���� ���� ��Ʈ�� ���� ū ���� �����ϰ� �ȴ�. ��Ʈ�� ���� ������ ��ҿ�  �ٲ� ��, ���� ����� �ϳ� ���δ�.(extract����)
 * 3. ���� ����� 1���� ũ�� �� ������ �ݺ��Ѵ�.
 * */
public class HeapSorter {

	public void heapSort(int[] array) {
		int n = array.length;
		
		//init, max heap
		for(int i = n/2-1; i>=0; i--) {
			heapify(array, n, i); // �Ϲ� �迭�� ������ �����ϴ� ����.
		}
		
		//for extract max element from heap
		for(int i=n-1; i>0; i--) {
			swap(array, 0, i); 
			heapify(array, i, 0); 
		}
	}
	
	//�Ϲ� �迭arr[i]�� �θ����� ��, �ڽĳ�尪�� arr[2*i+1]�� arr[2*i+2]
	public void heapify(int array[], int n, int i) {
		int p = i;
		int l = i*2+1;
		int r = i*2+2;
		
		//left childNode
		if(l<n&&array[p]<array[l]) {
			p = l;
		}
		
		//right childNode
		if(r<n&&array[p]<array[r]) {
			p = r;
		}
		
		//parentNode < childNode
		if(i!=p) {
			swap(array, p, i);
			heapify(array, n, p);
		}
	}
	
	public static void swap(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
}

