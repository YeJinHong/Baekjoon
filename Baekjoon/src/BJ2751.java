import java.util.Scanner;

public class BJ2751 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
		for(int i=0; i<N; i++) {
			a[i] = sc.nextInt();
		}
		quicksort(a);
		
		for(int l=0; l<a.length; l++) {
			System.out.println(a[l]);
		}
		
	}
	
	public static void partition(int a[]) {
		
		
	}
	
	public static void quicksort(int a[]) {
			
	}
}
