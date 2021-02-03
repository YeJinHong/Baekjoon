package sort;

// 힙 : 완전 이진 트리의 일종, 우선순위 큐를 위하여 만들어진 자료구조.
// 최대 힙 : 부모노드의 값이 자식노드의 값보다 항상 큰 힙
// 최소 힙 : 부모노드의 값이 자식노드의 값보다 항상 작은 힙
// 시간복잡도 : O(nlogn)
/* 단계
 * 1. 최대 힙을 구성한다.
 * 2. 현재 힙의 루트는 가장 큰 값이 존재하게 된다. 루트의 값을 마지막 요소와  바꾼 후, 힙의 사이즈를 하나 줄인다.(extract연산)
 * 3. 힙의 사이즈가 1보다 크면 위 과정을 반복한다.
 * */
public class HeapSorter {

	public void heapSort(int[] array) {
		int n = array.length;
		
		//init, max heap
		for(int i = n/2-1; i>=0; i--) {
			heapify(array, n, i); // 일반 배열을 힙으로 구성하는 역할.
		}
		
		//for extract max element from heap
		for(int i=n-1; i>0; i--) {
			swap(array, 0, i); 
			heapify(array, i, 0); 
		}
	}
	
	//일반 배열arr[i]가 부모노드일 때, 자식노드값은 arr[2*i+1]과 arr[2*i+2]
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

