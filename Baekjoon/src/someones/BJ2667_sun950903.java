package someones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BJ2667_sun950903 {
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int[][] mat;
	static boolean[][] check;
	static int N, tx, ty, cnt = 1;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(br.readLine());
		mat = new int[N][N];
		String s;
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		for(int i= 0; i<N; i++) {
			s = br.readLine();
			for(int j=0; j<N; j++) {
				mat[i][j] = s.charAt(j) - 48;
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(mat[i][j] == 1) {
					dfs(i, j);
					arr1.add(cnt);
					cnt = 1;
				}
			}
		}
		
		sb.append(arr1.size()).append("\n");
		Collections.sort(arr1);
		for(int i=0; i<arr1.size(); i++) {
			sb.append(arr1.get(i)).append("\n");
		}
		System.out.println(sb.toString());
	}
	
	static void dfs(int row, int col) {
		tx=0; ty=0;
		mat[row][col] = 2; // 쓰레기값
		
		for(int i=0; i<4; i++) {
			tx = row + dx[i];
			ty = col + dy[i];
			
			if(tx < 0 || tx >= N || ty < 0 || ty >= N || mat[tx][ty] != 1) {
				continue;
			}
			
			cnt++;
			dfs(tx, ty);
		}
	}
	
}
