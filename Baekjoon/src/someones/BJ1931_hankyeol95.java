package someones;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.PriorityQueue;

class Meeting implements Comparable<Meeting>{
	int startTime;
	int endTime;
	
	Meeting(int s, int e){
		startTime = s;
		endTime = e;
	}
	
	@Override
	public int compareTo(Meeting m) {
		if(this.startTime != m.startTime) {
			return this.startTime - m.startTime;
		} else {
			return this.endTime - m.endTime;
		}
	}
}

public class BJ1931_hankyeol95 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = null;
		PriorityQueue<Meeting> pq = new PriorityQueue<Meeting>();
		
		for(int i=0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			pq.offer(
					new Meeting(
							Integer.parseInt(st.nextToken()),
							Integer.parseInt(st.nextToken())
					)
			);
		}
		
		Meeting tmp = pq.poll();
		int minEnd = tmp.endTime;
		int maxNum = 1;

		
		while(pq.size() > 0) {
			tmp = pq.poll();
			if(minEnd > tmp.startTime) {
				minEnd = minEnd > tmp.endTime ? tmp.endTime : minEnd;
			} else {
				minEnd = tmp.endTime;
				maxNum++;
			}
		}//end while
		
		System.out.println(maxNum);
	}
}