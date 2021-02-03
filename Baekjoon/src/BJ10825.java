import java.util.*;
import java.io.*;

public class BJ10825 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String grade[][] = new String[n][4];
		//입력 받기
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<4; j++)
				grade[i][j] = st.nextToken();
		}
		
		Arrays.sort(grade, new Comparator<String[]>() {
			@Override
			public int compare(String e1[], String e2[]) {
				if(e1[1].contentEquals(e2[1])) {
					if(e1[2].contentEquals(e2[2])) {
						if(e1[3].contentEquals(e2[3])) {
							return e1[0].compareTo(e2[0]);
						}
						else {
							return Integer.parseInt(e2[3])-Integer.parseInt(e1[3]);
						}
					}
					else {
						return Integer.parseInt(e1[2])-Integer.parseInt(e2[2]);
					}
				}		
				else {
					return Integer.parseInt(e2[1])-Integer.parseInt(e1[1]);
				}
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++) {
			sb.append(grade[i][0]).append("\n");
		}
		System.out.print(sb);
		
	}
}
