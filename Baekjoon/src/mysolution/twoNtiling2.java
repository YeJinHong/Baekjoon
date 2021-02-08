package mysolution;
import java.util.Scanner;

//11727
public class twoNtiling2 {
	public static void main(String args[]) {
        int n = new Scanner(System.in).nextInt();
        if(n<1||n>1000)
            System.err.print("out of bound");
        int D[] = new int[n+1];
        D[0] = 1;
        D[1] = 1;
        // 일반화된 알 수 없는 공간의 방법의 수를 D[k]라고 하자.
        // 일반화된 알 수없는 공간에서 1만큼의 가로 길이가 늘어나면
        // 끝에 2*1타일을 하나 놓는 상태(D[k]),
       	// 마지막 타일이 2*1타일이며 이와 새 공간을 이용하여 1*2타일을 두개 놓는 경우 D[k-1]
        // 마지막 타일이 2*1타일이며 이와 새 공간을 이용하여 2*2타일을 하나 놓는 경우 D[k-1]
        // 따라서 D[k+1] = D[k]+D[k-1]
        for(int i=2; i<=n;i++) {
        	D[i] = D[i-1]+2*D[i-2];
        	D[i] %= 10007;
        }
        System.out.println(D[n]);
	}
}
