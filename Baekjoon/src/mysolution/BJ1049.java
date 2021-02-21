package mysolution;

import java.io.*;
import java.util.*;

//��Ÿ��
public class BJ1049 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int brand[][] = new int[M][2];
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			brand[i][0] = Integer.parseInt(st.nextToken());
			brand[i][1] = Integer.parseInt(st.nextToken());
		}
		
		int mPackage = brand[0][0]; // ��Ű�� ������ �귣�� ���� 
		int mPiece = brand[0][1]; // ���� ������ �귣�� ����
		
		for(int i=1; i<M; i++) {
			if(brand[i][0] < mPackage) {
				mPackage = brand[i][0];
			}
			if(brand[i][1] < mPiece) {
				mPiece = brand[i][1];
			}
		}
		
		int sum = 0;
		if(mPackage>6*mPiece) { // ��� 1. ������
			sum = N*mPiece;
		} else {
			if((N%6)*mPiece>mPackage) { // ��� 2.��Ű����
				sum = (N/6+1)*mPackage;
			} else { // ��� 3. ��Ű��+����
				sum = (N/6)*mPackage;
				sum += (N%6)*mPiece;
			}
		}
		
		System.out.print(sum);
	}
}
