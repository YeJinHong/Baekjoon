package mysolution;
import java.util.Scanner;


public class GuitarString {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		if(N<0 || N>100 || M <0 || M>50)
			System.err.print("Out of Bound");
		int p_package[] = new int[M];
		int p_piece[] = new int[M];
		
		for(int i =0; i<M; i++) {
			p_package[i] = sc.nextInt();
			if(p_package[i] <=0 || p_package[i] > 1000)
				System.err.print("Out of Bound : package price");
			p_piece[i] = sc.nextInt();
			if(p_piece[i] <=0 || p_piece[i] > 1000)
				System.err.print("Out of Bound : piece price");
		}
		for(int i =0; i<M; i++) {
			System.out.println("p_package["+i+"]"+p_package[i]);
			System.out.println("p_piece["+i+"]"+p_piece[i]);
		}
		
		// 각 브랜드에서 패키지와 낱개 가격 중 적은 것으로 N개 이상 구매하는 가격
		// 각 브랜드에서 교차 구매를 하는 경우도 고려하여야한다.
		/* 1) N이 6보다 낮을 때, 패키지 한 개의 가격이 낱개 N개 보다 낮다면 패키지를 하나 구입한다.
		 * 즉 3개의 브랜드의 패키지 가격과 3개의 브랜드 낱개 N개의 가격 총 6개를 비교하여 그 중 가장 낮은 값을 선택한다.
		 * 2) N이 6보다 크고, 6의 배수일때
		 *  패키지의 (N/6)개 가격이 낱개 N개의 가격보다 낮다면 패키지를 구입한다.
		 * 3) N이 6보다 크며, 6의 배수가 아닐 때
		 *  패키지의 (N/6+1)개 가격이 낱개 N개의 가격보다 낮다면 패키지(N/6+1)개와 낱개 (N%6)개를 구입한다.
		 * */
		int m = 0;
		int min[] = new int[M];
		for(int i=0; i<M; i++) {
			for(int j=0; j<M; j++) {
				if(N < 6) {
					if(p_package[i] > (N)*p_piece[j]);

				}
			}
		}
		
		System.out.print(m);
	}

}
