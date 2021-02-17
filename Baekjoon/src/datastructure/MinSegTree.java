package datastructure;

import java.util.Arrays;

// 세그먼트 트리 : 배열에 부분 합을 구할 때 사용하는 개념. O(logN). Complete Binary Tree
// 배열(N) -> 트리(리프 노드 N, 높이 H(=logN)
// 1) 부모 노드의 값은 양 쪽 자식 노드 값의 합
// 2) 배열의 요소들은 리프 노드에 위치
// 연산은 데이터 갱신(Update)와 질의(Query)

// 구간의 최소값을 구하는 세그먼트 트리
public class MinSegTree {
	
	long segArr[];
	
	MinSegTree(int[] arr, int arrSize){
		this.segArr = new long[arrSize*4];
		Arrays.fill(segArr, Integer.MAX_VALUE);
		init(arr, 0, arrSize-1, 1);
	}
	
	long init(int arr[], int left, int right, int node) {
		
		if(left == right) return segArr[node] = arr[left];
		int mid = (left+right)/2;
		return segArr[node] = Math.min(init(arr, left, mid, node*2), init(arr, mid+1, right, node*2+1));
	}
	
	long query(int sIdx, int eIdx, int node, int nodeLeft, int nodeRight) {
		
		if(sIdx > nodeRight || eIdx < nodeLeft) return Integer.MAX_VALUE;
		if(sIdx <= nodeLeft && eIdx >= nodeRight) return segArr[node];
		int mid = (nodeLeft+nodeRight)/2;
		return Math.min(query(sIdx, eIdx, node*2, nodeLeft, mid), query(sIdx, eIdx, node*2+1, mid+1, nodeRight));
	}

}
