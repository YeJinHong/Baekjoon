import java.io.*;

//�ð����� 3��
//�Է°� �ִ� 1000��
//Arrays.sort�� �뷫 ����Ʈ�� ������ �ð����⵵ nlog_2(n)~n^2

public class BJ10989 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
		int arr[] = new int[10000+1];
		for(int i=0; i<n; i++) {
			arr[Integer.parseInt(br.readLine())] += 1; 
		}
		
		for(int i=1; i<10001; i++) {
			while(arr[i]--!=0) {
				bw.write(Integer.toString(i)+"\n");
				bw.flush();
			}
		}
		br.close();
		bw.close();
	}
}
