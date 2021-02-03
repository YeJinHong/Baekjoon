package search;

//분할 수 정복 전략
//시간복잡도 : O(logN)
public class BinarySearch {
	public static void binarySearch(int iKey, int arr[]) {
		int mid;
		int left = 0;
		int right = arr.length-1;
		
		while(right >= left) {
			mid = (right+left)/2;
			
			if(iKey == arr[mid]) {
				System.out.println(iKey+" is in the array with index value: "+ mid);
				break;
			}
			if(iKey<arr[mid]) {
				right = mid-1;
			} else {
				left = mid+1;
			}
		}
	}
}
