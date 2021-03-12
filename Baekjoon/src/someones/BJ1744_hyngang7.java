package someones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BJ1744_hyngang7 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        boolean hasZero = false;
        int oneCnt = 0;
        for(int i = 0; i< n; i++) {
        	int input = Integer.parseInt(br.readLine());
        	if(input > 0) {
        		if(input == 1) { // 1�� ���ϸ� ������ �����̹Ƿ� ���� ������ ���� �����ش�.
        			oneCnt += 1;
        		} else {
        			positive.add(input);
        		}
        	} else if(input < 0) {
        		negative.add(input);
        	} else {
        		hasZero = true;
        	}
        }
        
        //���, ���� ���� ���밪���� ũ��� ��������
        Collections.sort(positive);
        Collections.reverse(positive);
        Collections.sort(negative);
        
        int ans = oneCnt;
        int size = positive.size();
        for(int i=0; i < size; i += 2) { // positive
        	if(i==size-1) {
        		// positive�� Ȧ���� �̸� ���밪�� ���� ���� ���� �׳� ������
        		ans += positive.get(i);
        	} else {
        		ans += positive.get(i)*positive.get(i+1);
        	}
        }
        
        size = negative.size();
        for(int i= 0; i<size; i+=2) {
        	if(i == size -1) { // negative�� Ȧ�����̸� ���밪�� ���� ���� ������ 0���� ����ų �� �ִ��� Ȯ��
        		if(!hasZero) { // ������ ����ų 0�� ������ �׳� ���� ���ϱ�
        			ans += negative.get(i);
        		}
        	} else {
        		ans += negative.get(i)*negative.get(i+1);
        	}
        }
        System.out.println(ans);
	}
}
