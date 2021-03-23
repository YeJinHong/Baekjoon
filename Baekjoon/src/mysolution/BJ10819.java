package mysolution;

import java.util.Arrays;
import java.util.Scanner;

//���̸� �ִ��
//�� �� - https://log-laboratory.tistory.com/122 
//��ͺκп��� ������ ���ذ� �Ȱ���.
public class BJ10819 {
	static int n;
	static int[] arr;
	static int result;
	static int[] tArr;
	static boolean[] visited;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		visited = new boolean[n];
		tArr=new int[n]; // �� ���� ���̽��� ����� �ӽ� �����
		
		result = 0;
		solve(0);
		System.out.println(result);
	}
	private static void solve(int count) {
		if(count == n) {
			int sum = 0;
			for(int i : tArr)
				System.out.print(i+"\t");
			System.out.println();
			
			for(int i=0; i<n-1; i++) {
				sum += Math.abs(tArr[i] - tArr[i+1]);
			}
			result = Math.max(result, sum);
			return;
		}
		
		for(int i=0; i<n; i++) { // �� ���� ���̽� ����
			if(visited[i]) {
				continue;
			}
			visited[i] = true;
			tArr[count] = arr[i]; // ��´�.
			solve(count + 1); // ��ͷ� �� ���� index �÷�����.
			visited[i] = false; // �� ����� false�� ����
		}
	}
}
