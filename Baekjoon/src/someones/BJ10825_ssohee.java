package someones;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

class Score implements Comparator<Score>{
	private String name;
	private int korean;
	private int english;
	private int math;
	
	public Score(String name, int korean, int englisth, int math) {
		super();
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	
	Score() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int compare(Score o1, Score o2) {
		if(o1.korean == o2.korean&&o1.english==o2.english&&o1.math==o2.math)
			return o1.name.compareTo(o2.name);
		else if(o1.korean == o2.korean&&o1.english==o2.english)
			return (o1.math-o2.math)*-1;
		else if(o1.korean == o2.korean)
			return (o1.english-o2.english);
		else
			return (o1.korean-o2.korean)*-1;
	}
}
public class BJ10825_ssohee {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		Score[] sc = new Score[n];
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			sc[i] = new Score(st.nextToken(), Integer.parseInt(st.nextToken()),
					Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()) );
		}
		Arrays.sort(sc, new Score());
		for(int i=0; i<sc.length; i++) {
			bw.write(sc[i].getName());
			bw.newLine();
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
	
}
