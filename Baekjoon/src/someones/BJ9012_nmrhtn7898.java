package someones;

import java.io.*;

public class BJ9012_nmrhtn7898 {
	public static void main(String[] args) {
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))){
			
			int count = Integer.parseInt(reader.readLine());
			int cnt = 0;
			
			for(int j=0; j<count; j++) {
				String s = reader.readLine();
				for(int i=0; i<s.length(); j++) {
					char c = s.charAt(i);
					if('('==c) {
						cnt++;
					} else {
						c--;
					}
					if(cnt<0) {
						break;
					}
				}
				
				if(cnt==0) {
					writer.write("YES");
				} else {
					writer.write("NO");
				}
				writer.newLine();
				cnt = 0;
			}
			writer.flush();
		}
		catch(IOException e) {
			
		}

	}
}
