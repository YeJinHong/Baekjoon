import java.util.Scanner;

public class treasure {

	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N<=0 || N>50)
			System.err.print("Out of bound : N");
		int A[] = new int[N];
		int A_i[] = new int[N];
		int A_re[] = new int[N];
		int B[] = new int[N];
		int B_i[] = new int[N];
		for(int i:A) {
			A[i] = sc.nextInt();
			if(A[i]<0 || A[i]>100)
				System.err.print("Out of bound : A");
		}
		for(int i:B){
			B[i] = sc.nextInt();
			if(B[i]<0 || B[i]>100)
				System.err.print("Out of bound : B");
		}
		// B�� ���� ū ���� A�� ���� ���� ���� ���ϵ����ϸ� �ȴ�.
		// A�� ���� ���� ������� 0���� �����ϴ� ��ȣ�� �ű��. �̴� A_i�� ����ȴ�.
		// B�� ���� ū ������� 0���� �����ϴ� ��ȣ�� �ű��. �̴� B_i�� ����ȴ�.
		// A_i�� i��° ��ġ�� B_i�� j��° ��ġ�� ���Ͽ�, ���� ���� ���
		// A_re�� j��° ��ġ�� A�� i��°���� �����Ѵ�.
		
		int index = 0;
		for(int i:A){
			int m = 100;
			
		}
	}
}
