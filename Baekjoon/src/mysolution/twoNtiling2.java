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
        // �Ϲ�ȭ�� �� �� ���� ������ ����� ���� D[k]��� ����.
        // �Ϲ�ȭ�� �� ������ �������� 1��ŭ�� ���� ���̰� �þ��
        // ���� 2*1Ÿ���� �ϳ� ���� ����(D[k]),
       	// ������ Ÿ���� 2*1Ÿ���̸� �̿� �� ������ �̿��Ͽ� 1*2Ÿ���� �ΰ� ���� ��� D[k-1]
        // ������ Ÿ���� 2*1Ÿ���̸� �̿� �� ������ �̿��Ͽ� 2*2Ÿ���� �ϳ� ���� ��� D[k-1]
        // ���� D[k+1] = D[k]+D[k-1]
        for(int i=2; i<=n;i++) {
        	D[i] = D[i-1]+2*D[i-2];
        	D[i] %= 10007;
        }
        System.out.println(D[n]);
	}
}
