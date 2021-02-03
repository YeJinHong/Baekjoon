package sort;

//�� ���� ī�带 �����ϴ� ����� ����
//�տ������� ���ʴ�� �̹� ���ĵ� �迭 �κа� ���Ͽ�, �ڽ��� ��ġ�� ã�� ����.
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
