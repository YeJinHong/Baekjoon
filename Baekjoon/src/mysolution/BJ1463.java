package mysolution;
import java.util.Scanner;

//1�� �����
public class BJ1463 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N<1||N>1000000)
            System.err.print("out of bound");
        int min[] = new int[N+1];
        min[0] = 0;
        min[1] = 0;
        
        for(int i=2; i<=N; i++){
        	int case1 = N;
            int case2 = N;
            int case3 = N;
            
        	// i-1�� Ƚ������ �� �� ���� ��
            case1 = min[i-1]+1;
            // i/3�� Ƚ������ �� �� ���� ��
            if(i%3==0)
                case2 = min[i/3]+1;
            // i/2�� Ƚ������ �� �� ���� ��
            if(i%2==0)
                case3 = min[i/2]+1;
            min[i] = Math.min(Math.min(case1, case2), case3);

        }
        
        System.out.print(min[N]);
        
    }
}