import java.io.*;

public class BJ9012 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String s;
		Loop1 :
		while(t-->0) {
			int left=0, right=0;
			s = br.readLine();
			Loop2 :
			for(int i=0; i<s.length(); i++) {
				if(s.charAt(i)=='(')
					left++;
				else if(s.charAt(i)==')') {
					if(left < ++right) {
						System.out.println("NO");
						continue Loop1;
					}
				}
			}
			if(left == right) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
}
