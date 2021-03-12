package mysolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class BJ1744 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pos = new PriorityQueue<Integer>(Collections.reverseOrder());
		PriorityQueue<Integer> neg = new PriorityQueue<Integer>();
		boolean zero = false;
		for (int i = 0; i < n; i++) {
			int in = Integer.parseInt(br.readLine());
			if (in == 0)
				zero = true;
			else if (in > 0) {
				pos.offer(in);
			} else {
				neg.offer(in);
			}
		}

		int sum = 0;

		while (!pos.isEmpty()) {
			int temp = pos.poll();
			if (temp == 1) {
				sum += temp;
				continue;
			}
			
			else if (!pos.isEmpty()) {
				int temp2 = pos.poll();
				if(temp2 == 1)
					sum+= temp + temp2;
				else
					sum += temp * temp2;
			} else {
				sum += temp;
				break;
			}

		}

		while (!neg.isEmpty()) {
			int temp1 = neg.poll();
			if (neg.isEmpty()) {
				if (zero)
					break;
				sum += temp1;
			} else {
				int temp2 = neg.poll();
				sum += temp1 * temp2;
			}
		}

		System.out.println(sum);

	}
}
