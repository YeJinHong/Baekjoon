package mysolution;
import java.io.*;
import java.util.Scanner;

/* �� ������ �Էµ� ���� ��� ���� ���� ��(1)���� ġȯ�ȴٴ� ������ ������ �ִ�.
	* ���� ���� ���� ���� ��ġ�� �Էµ� ��������� ũ�� ���踦 ã���ָ�,
	* �������� �䱸�ϴ� �ּ����� Ƚ���� ã�� �� �ִ�.
*/

public class brandi {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String input = br.readLine();
		int N = sc.nextInt();
		int K = sc.nextInt();
		int input[] = new int[N];
		if(N<2 || N>100000)
			System.err.print("Out of bound");
		if(K<2 || K>N)
			System.err.print("Out of bound");
		
		for(int i=0; i<N; i++)
			input[i] = sc.nextInt();
	
		for(int i=0; i<N; i++)
			for(int j=i+1; j<N; j++)
				if(input[i] == input[j])
					System.err.print("Invalid value");
					
		int index_of_one = 0;
		int n = 0;
		for(int i:input)
			if(input[i]==1)
				index_of_one = i;
		
		/* �� ������ 1�� ġȯ�Ǵ� Ÿ�̹��� �ٸ� ��,
		* ��������� �̻����� chunk�� �迭�� ���� ���¸� �����ִ�.
		* ��� chunk�� ���� ���� ������ �����ϸ� ��ü �迭�� ũ�⺸�� ���̰� Ŀ������
		* Kũ���� chunk ������ n�̶� �� ��
		* K+(K-1)*n > N �� ���� ���� �ڿ��� n
		*/
		n = (int)(N-K/K-1);
		
		System.out.print(n);

	}
}