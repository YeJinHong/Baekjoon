package someones;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class BJ1406_belita76 {
	public static LinkedList<Character> linkedList;
	public static int cursor = 0;
	public static int N;
	public static int M;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		String word;
		String command;
		Character alphabet;
		
		word = br.readLine();
		linkedList = new LinkedList<>();
		for(int index=0; index<word.length(); index++) {
			linkedList.add(word.charAt(index));
		}
		
		ListIterator<Character> iter = linkedList.listIterator();
		//처음 커서는 문장의 맨 뒤에 있어야하기 때문에 커서를 맨 뒤로 이동시켜줌
		while(iter.hasNext()) {
			iter.next();
		}
		
		M = Integer.parseInt(br.readLine());
		for(int count = 0; count<M; count++) {
			command = br.readLine();
			//다른 방법 :
			//char[] temp = br.readLine().toCharArray();
			
			switch(command.charAt(0)) {
			case 'L':
				if(iter.hasPrevious()) {
					iter.previous();
				}
				break;
			case 'D':
				if(iter.hasNext()) {
					iter.next();
				}
				break;
			case 'B':
				//remove()는 next()나 previous()에 의해 반환된 가장 마지막 요소를 리스트에서 제거함.
				if(iter.hasPrevious()) {
					iter.previous();
					iter.remove();
				}
				break;
			case 'P':
				alphabet = command.charAt(2);
				iter.add(alphabet);
				break;
			}
		}
		
		for(Character c : linkedList) {
			bw.write(c);
		}
		bw.flush();
		bw.close();
		
	}
}
