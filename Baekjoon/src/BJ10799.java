import java.io.*;

public class BJ10799 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int stick = 0; // ���� �����ִ� �� ������ ��
		int sum = 0; // �������� �߸� ������ ��
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='(') {
				if(s.charAt(i+1)==')') {
					sum += stick; 
					i++;
				}
				else { //���ο� ���밡 ���۵�.
					stick++;
				}
			}
			else {
				stick--; // ���� ª�� (���� �ִ�) ���밡 ����.
				sum++;
			}
		}
		System.out.print(sum);
	}
}
