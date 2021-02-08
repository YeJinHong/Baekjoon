package mysolution;
import java.io.*;
import java.util.Scanner;

/* 위 문제는 입력된 값이 모두 가장 작은 값(1)으로 치환된다는 성격을 가지고 있다.
	* 따라서 가장 작은 값의 위치와 입력된 단위블록의 크기 관계를 찾아주면,
	* 문제에서 요구하는 최소한의 횟수를 찾을 수 있다.
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
		
		/* 위 문제는 1로 치환되는 타이밍이 다를 뿐,
		* 결과적으로 이상적인 chunk가 배열을 감싼 형태를 묻고있다.
		* 모든 chunk가 가장 적은 영역을 공유하며 전체 배열의 크기보다 길이가 커질때는
		* K크기의 chunk 갯수를 n이라 할 때
		* K+(K-1)*n > N 인 가장 작은 자연수 n
		*/
		n = (int)(N-K/K-1);
		
		System.out.print(n);

	}
}