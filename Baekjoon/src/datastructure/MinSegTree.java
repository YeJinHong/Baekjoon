package datastructure;

import java.util.Arrays;

// ���׸�Ʈ Ʈ�� : �迭�� �κ� ���� ���� �� ����ϴ� ����. O(logN). Complete Binary Tree
// �迭(N) -> Ʈ��(���� ��� N, ���� H(=logN)
// 1) �θ� ����� ���� �� �� �ڽ� ��� ���� ��
// 2) �迭�� ��ҵ��� ���� ��忡 ��ġ
// ������ ������ ����(Update)�� ����(Query)

// ������ �ּҰ��� ���ϴ� ���׸�Ʈ Ʈ��
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
