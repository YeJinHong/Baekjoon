package mysolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Vector;

//�� �� : https://mingmeng030.tistory.com/17
//�з� : �ڷ� ����, ���׸�Ʈ Ʈ��

//LinkedList, ArrayList, Vector ������ ��� �ð� �ʰ�. ��� Ȯ�� �Ұ���.
public class BJ1168 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st  = new StringTokenizer(br.readLine());
		
        int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		Vector<Integer> v = new Vector<Integer>();
		
		for(int i=1; i<n+1; i++) {
			v.add(i);
		}
		
		int now = k-1; //���� ��ġ == now
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			sb.append(v.get(now));
			v.remove(now);
			if(v.size()==0) break;
			sb.append(", ");
			now += k-1;
			now %= v.size();
		}
		
		bw.write("<"+sb.toString()+">");
		bw.flush();
		bw.close();
		br.close();		
	}
}

