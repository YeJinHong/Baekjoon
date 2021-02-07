package someones;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.StringTokenizer;

public class BJ11004_sys920525 {
	static IO_Manager io = new IO_Manager();
	static final int NINF = Integer.MIN_VALUE / 4;
	static final int INF = Integer.MAX_VALUE;
	
	static int N, K, ANS;
	
	static int[] list = new int[5000000];
	
	public static void main(String[] args) throws IOException{
		Init();
		QuickSearch(list, 0, N-1, K-1);
		System.out.println(list[K-1]);
	}
	
	static void Init() throws IOException {
		StringTokenizer stk = new StringTokenizer(io.inputStr());
		N = nextInt(stk); K = nextInt(stk);
		ANS = INF;
		stk = new StringTokenizer(io.inputStr());
		for(int i=0; i<N; i++) {
			list[i] = nextInt(stk);
		}
	}
	
	static int Partition(int[] arr, int left, int right) {
		int pivot = (left+right)/2;
		Swap(arr, left, pivot);
		
		int i = left, j = right, P = arr[left];
		while(i<j) {
			//j는 더 작거나 같은 것을 찾는다. (큰 것은 패스)
			while(arr[j]>P) j--;
			//i는 더 큰 것을 찾는다. (작거나 같으면 패스)
			while(i < j && arr[i] <= P) i++;
			Swap(arr, i, j);
		}
		//i의 끝난 위치는 더 큰 것이 없는 자리. 피벗 left의 올바른 위치.
		Swap(arr, i, left);
		return i;
	}
	
	static void Swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	static void QuickSearch(int[] arr, int left, int right, int k) {
		if(left >= right) return;
		int part = Partition(arr, left, right);
		
		if(part==k) {
			return;
		}
		
		if(k>part) QuickSearch(arr, part+1, right, k);
		else QuickSearch(arr, left, part-1, k);
	}
	
	
	
		// ============================================================
		// ============================================================
		// ============================================================
		// ===================== functions for PS =====================
		// ============================================================
		// ============================================================
	static int nextInt(StringTokenizer stk) {
		return Integer.parseInt(stk.nextToken());
	}
	static long Min(long a, long b) {
		return (a > b)? b : a;
	}
	static long Max(long a, long b) {
		return (a > b)? a : b;
	}
	static int Min(int a, int b) {
		return (a > b)? b : a;
	}
	static int Max(int a, int b) {
		return (a > b)? a : b;
	}
	static void Display(int[] arr, int limit) {
		System.out.println("요소 갯수 : "+arr.length);
		for(int i=0; i < limit; i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	static void Display(int[][] arr, int limit) {
		System.out.println("요소 갯수 : "+(arr.length*arr[0].length));
		for(int i=0; i < limit; i++) {
			System.out.print("["+i+"] :");
			for(int j=0; j < arr[i][j]; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
}

//************************************** //
//*-------------IO_Manager--------------* //
//************************************** //
class IO_Manager{
	public BufferedReader br;
	public BufferedWriter bw;
	
	public IO_Manager() {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
	}
	public Integer inputInt() throws IOException{
		return Integer.parseInt(br.readLine());
	}
	public Long inputLong() throws IOException{
		return Long.parseLong(br.readLine());
	}
	public String inputStr() throws IOException{
		return br.readLine();
	}
	public void write(String str) throws IOException{
		bw.write(str);
	}
	public void close() throws IOException{
		br.close();
		bw.close();
	}
}
