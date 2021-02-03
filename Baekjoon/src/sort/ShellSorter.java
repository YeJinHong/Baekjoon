package sort;

//삽입정렬을 보완한 알고리즘
//삽입정렬의 최대 문제점 : 요소 삽입 시 멀리 떨어진곳은 많은 이동을 필요로 할 수 있음.
//시간복잡도 n~n^2
//아래는 오름차순 정렬
public class ShellSorter {
	public void inc_insertion_sort(int list[], int first, int last, int gap) {
		int i, j, key;
		
		for(i=first+gap; i<=last; i=i+gap) {
			key = list[i];
			
			for(j=i-gap; j>=first && list[j]>key; j=j-gap) {
				list[j+gap] = list[j];
			}
			
			list[j+gap] = key;
		}
	}
	
	public void shell_sort(int list[], int n) {
		int i, gap;
		
		for(gap=n/2; gap>0; gap=gap/2) {
			if((gap%2)==0){
				gap++;
			}
			
			for(i=0; i<gap; i++) {
				inc_insertion_sort(list, i, n-1, gap);
			}
		}
	}
}
