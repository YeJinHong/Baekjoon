package someones;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BJ11655_bob123 {
	public static void main(String[] args) throws IOException{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = bufferedReader.readLine();
		
		for(int i=0; i<s.length(); i++) {
			int word = s.charAt(i);
			
			if(word == 32) {
				bufferedWriter.write(" ");
				continue;
			}
			
			if(48 <= word && word <= 57) { // 0~9
				bufferedWriter.write(String.valueOf(Character.getNumericValue(word)));
				continue;
			}
			
			if(97 <= word && word <= 109) { // a~n
				int temp = 122 - (12 - (word-97));
				bufferedWriter.write(Character.toChars(temp));
				continue;
			}
			
			bufferedWriter.write(Character.toChars(word -13));
		}
		
		bufferedWriter.flush();
		bufferedReader.close();
		bufferedWriter.close();
	}

}
