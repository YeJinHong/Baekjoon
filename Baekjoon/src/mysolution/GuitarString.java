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
		
		// �� �귣�忡�� ��Ű���� ���� ���� �� ���� ������ N�� �̻� �����ϴ� ����
		// �� �귣�忡�� ���� ���Ÿ� �ϴ� ��쵵 ����Ͽ����Ѵ�.
		/* 1) N�� 6���� ���� ��, ��Ű�� �� ���� ������ ���� N�� ���� ���ٸ� ��Ű���� �ϳ� �����Ѵ�.
		 * �� 3���� �귣���� ��Ű�� ���ݰ� 3���� �귣�� ���� N���� ���� �� 6���� ���Ͽ� �� �� ���� ���� ���� �����Ѵ�.
		 * 2) N�� 6���� ũ��, 6�� ����϶�
		 *  ��Ű���� (N/6)�� ������ ���� N���� ���ݺ��� ���ٸ� ��Ű���� �����Ѵ�.
		 * 3) N�� 6���� ũ��, 6�� ����� �ƴ� ��
		 *  ��Ű���� (N/6+1)�� ������ ���� N���� ���ݺ��� ���ٸ� ��Ű��(N/6+1)���� ���� (N%6)���� �����Ѵ�.
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
