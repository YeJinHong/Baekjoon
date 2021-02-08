package mysolution;
import java.util.Scanner;

//2011
//��ȣ �ڵ�
public class PasswordCode {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long dp[] = new long[s.length()+1];
		//�ڿ��� �ΰ��� ���ڸ� Ȯ���Ѵ�.
		//00, 30, 40, 50, 60, 70, 80, 90 : 0
		//10,20 : dp[i-2]
		//01~09, 27~99 : dp[i-1]
		//11~19, 21~26 : dp[i-2]+dp[i-1]
		
		//dp[i] : ���� N�� i��° �ڸ����� ���ڵ��ϴ� ����� ��.
		dp[0] = 1;
		dp[1] = 1;
		String st;
		int n;
		int a;
		int b;
		for(int i=2; i<=s.length(); i++) {
			st = s.substring(i-2,i);
			n = Integer.parseInt(st);
			a = n/10; //�ڿ��� �ι�° ����
			b = n%10; // �ڿ��� ù��° ����
				
			if(b>0) {
				if(a==1||a==2)
					dp[i] = dp[i-2];
				else
					dp[i] = 0;
			}
			else if(n<10||n>26) {
				dp[i] = dp[i-1];
			}
			else {
				dp[i] = (dp[i-2]+dp[i-1])%1000000;
			}
			/*
			 * if(b>0)
			 * 	dp[i] = dp[i-1]
			 *
			 * */
		}
		
		System.out.println(s.contentEquals("0")? 0:dp[s.length()]);
	}
}
