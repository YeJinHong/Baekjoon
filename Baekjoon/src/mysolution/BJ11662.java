package mysolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// ¹ÎÈ£¿Í °­È£
public class BJ11662 {
	static float A[];
	static float B[];
	static float C[];
	static float D[];
	static BufferedReader br;
	static float result;
	
	public static void main(String args[]) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		
		init();
		solve();
		
		br.close();
	}
	
	
	static void solve() {
		float[] high_1 = A.clone();
		float[] low_1 = B.clone();
		float[] high_2 = C.clone();
		float[] low_2 = D.clone();
		
		double distance_1 = getDistance(high_1, high_2);
		double distance_2 = getDistance(low_1, low_2);
		
		//margin of error
		double moe = 0;
		if(distance_1 > distance_2)
			moe = distance_1 - distance_2;
		else
			moe = distance_2 - distance_1;
		
		while(moe > 0.000001) {
			//
		}
		
	}
	
	static double getDistance(float[] a, float[] b) {
		double distance = Math.sqrt((b[0]-a[0])*(b[0]-a[0]) + (b[1]-a[1])*(b[1]-a[1]));
		return distance;
	}
	
	static void init() throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		A = new float[2];
		B = new float[2];
		C = new float[2];
		D = new float[2];
		
		A[0] = Integer.parseInt(st.nextToken());
		A[1] = Integer.parseInt(st.nextToken());
		B[0] = Integer.parseInt(st.nextToken());
		B[1] = Integer.parseInt(st.nextToken());
		C[0] = Integer.parseInt(st.nextToken());
		C[1] = Integer.parseInt(st.nextToken());
		D[0] = Integer.parseInt(st.nextToken());
		D[1] = Integer.parseInt(st.nextToken());
	}
}
