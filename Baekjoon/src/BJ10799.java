import java.io.*;

public class BJ10799 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int stick = 0; // 현재 놓여있는 쇠 막대의 수
		int sum = 0; // 레이저로 잘린 막대의 수
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='(') {
				if(s.charAt(i+1)==')') {
					sum += stick; 
					i++;
				}
				else { //새로운 막대가 시작됨.
					stick++;
				}
			}
			else {
				stick--; // 가장 짧은 (위에 있는) 막대가 끝남.
				sum++;
			}
		}
		System.out.print(sum);
	}
}
