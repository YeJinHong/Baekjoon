package someones;
//�ٸ� ���� �ڵ带 �����غ��� package. 
//Ŭ���� �̸� ������ BJ������ȣ_���̵�

import java.io.*;
import java.util.*;

//656ms
//Comparator �����κ��� �����.
public class BJ11650_swy04026 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		StringTokenizer token;
		int[][] arr = new int[n][2];
		//�Է� �ޱ�
		for(int a=0; a<n; a++) {
			token = new StringTokenizer(br.readLine(), " ");
			arr[a][0] = Integer.parseInt(token.nextToken());
			arr[a][1] = Integer.parseInt(token.nextToken());
		}
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] e1, int[] e2) {
				//ù��° ���Ұ� ���ٸ� �� ��° ���ҳ��� ��
				if(e1[0] == e2[0]) {
					return e1[1] - e2[1];					
				}
				else {
					return e1[0] - e2[0];
				}
			}
		});
		
		for(int i=0; i<n; i++) {
			sb.append(arr[i][0]).append(' ').append(arr[i][1]).append('\n');
		}
		System.out.println(sb);
	}
}
