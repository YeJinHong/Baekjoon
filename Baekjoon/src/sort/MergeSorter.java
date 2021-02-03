package sort;

// i : ���ĵ� ���� ����Ʈ�� ���� �ε���
// j : ���ĵ� ������ ����Ʈ�� ���� �ε���
// k : ���ĵ� ����Ʈ�� ���� �ε���
public class MergeSorter {
	// merge : ���� �迭 list[left..mid]�� list[mid+1...right]�� �պ� ����
	final int MAX_SIZE = 8;
	int sorted[] = new int[MAX_SIZE];
	
	public void merge(int list[], int left, int mid, int right) {
		int i, j, k, l;
		i = left;
		j = mid+1;
		k = left;
		
		// ���� ���ĵ� list�� �պ�
		while(i<=mid && j<= right) {
			if(list[i]<=list[j])
				sorted[k++] = list[i++];
			else
				sorted[k++] = list[j++];
		}
		
		// ���� �ִ� ��(����)���� �ϰ� ����
		if(i>mid) {
			for(l=j; l<=right; l++)
				sorted[k++] = list[l];
		}
		
		else {
			for(l=i; l<=mid; l++)
				sorted[k++] = list[l];
		}
		
		// �迭 sorted[](�ӽ� �迭)�� ����Ʈ�� �迭 list[]�� �纹��
		for(l=left; l<=right; l++)
			list[l] = sorted[l];
	}
	
	public void merge_sort(int list[], int left, int right) {
		int mid;
		
		if(left<right) {
			mid = (left+right)/2; // �߰� ��ġ ���, ����Ʈ�� �յ� ����
			merge_sort(list, left, mid); // �� ����Ʈ ����
			merge_sort(list, mid+1, right); // �� ����Ʈ ����
			merge(list, left, mid, right); // ���ĵ� 2���� �κ� ����Ʈ �պ�
		}
	}
}
