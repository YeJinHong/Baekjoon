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
		// B의 가장 큰 값에 A의 가장 작은 값을 곱하도록하면 된다.
		// A의 값이 작은 순서대로 0부터 시작하는 번호를 매긴다. 이는 A_i에 저장된다.
		// B의 값이 큰 순서대로 0부터 시작하는 번호를 매긴다. 이는 B_i에 저장된다.
		// A_i의 i번째 위치와 B_i의 j번째 위치를 비교하여, 값이 같을 경우
		// A_re의 j번째 위치에 A의 i번째값을 삽입한다.
		
		int index = 0;
		for(int i:A){
			int m = 100;
			
		}
	}
}
