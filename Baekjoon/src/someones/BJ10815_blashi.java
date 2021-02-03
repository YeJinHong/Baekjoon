package someones;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ10815_blashi {
	//���� ī�忡 �����ִ� ���� -10,000,000���� ũ�ų� ����, 10,000,000���� �۰ų� ����.
	public static void main(String[] args) throws IOException {
		boolean[] exist = new boolean[20000000+1];
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		bf.readLine();
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		while(st.hasMoreTokens())
			exist[Integer.parseInt(st.nextToken())+10000000] = true;
		
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(bf.readLine());
		while(st.hasMoreTokens())
			sb.append(exist[Integer.parseInt(st.nextToken())+10000000]? 1+" ":0+" ");
		System.out.print(sb);
	}
}
