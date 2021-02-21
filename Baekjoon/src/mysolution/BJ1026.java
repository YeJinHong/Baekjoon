package mysolution;
import java.util.Arrays;
import java.util.Scanner;

//º¸¹°_¹Ì·ïµÒ

public class BJ1026 {

	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		int B[] = new int[N];
		for(int i:A) {
			A[i] = sc.nextInt();
			System.out.print(A[i]+" ");
		}
		for(int i:B){
			B[i] = sc.nextInt();
			System.out.print(B[i]+" ");
		}

	}
}
