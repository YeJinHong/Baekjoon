package mysolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//8진수 2진수
public class BJ1212 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringBuilder sb = new StringBuilder();
		sb.append(Integer.toBinaryString(s.charAt(0)-48));
		for(int i=1; i<s.length(); i++) {
			String str = Integer.toBinaryString(s.charAt(i)-48);
			if(str.length()>=3)
				sb.append(str);
			else if(str.length()==2)
				sb.append("0").append(str);
			else
				sb.append("00").append(str);
		}
		
		System.out.print(sb);		
	}

}
