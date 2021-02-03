package sort;

// i : 정렬된 왼쪽 리스트에 대한 인덱스
// j : 정렬된 오른쪽 리스트에 대한 인덱스
// k : 정렬된 리스트에 대한 인덱스
public class MergeSorter {
	// merge : 인접 배열 list[left..mid]와 list[mid+1...right]의 합병 과정
	final int MAX_SIZE = 8;
	int sorted[] = new int[MAX_SIZE];
	
	public void merge(int list[], int left, int mid, int right) {
		int i, j, k, l;
		i = left;
		j = mid+1;
		k = left;
		
		// 분할 정렬된 list의 합병
		while(i<=mid && j<= right) {
			if(list[i]<=list[j])
				sorted[k++] = list[i++];
			else
				sorted[k++] = list[j++];
		}
		
		// 남아 있는 값(우측)들을 일괄 복사
		if(i>mid) {
			for(l=j; l<=right; l++)
				sorted[k++] = list[l];
		}
		
		else {
			for(l=i; l<=mid; l++)
				sorted[k++] = list[l];
		}
		
		// 배열 sorted[](임시 배열)의 리스트를 배열 list[]로 재복사
		for(l=left; l<=right; l++)
			list[l] = sorted[l];
	}
	
	public void merge_sort(int list[], int left, int right) {
		int mid;
		
		if(left<right) {
			mid = (left+right)/2; // 중간 위치 계산, 리스트를 균등 분할
			merge_sort(list, left, mid); // 앞 리스트 정렬
			merge_sort(list, mid+1, right); // 뒤 리스트 정렬
			merge(list, left, mid, right); // 정렬된 2개의 부분 리스트 합병
		}
	}
}
