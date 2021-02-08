package mysolution;
import java.util.Scanner;

public class MakingOne{
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
            
        	// i-1의 횟수에서 한 번 더한 값
            case1 = min[i-1]+1;
            // i/3의 횟수에서 한 번 더한 값
            if(i%3==0)
                case2 = min[i/3]+1;
            // i/2의 횟수에서 한 번 더한 값
            if(i%2==0)
                case3 = min[i/2]+1;
            min[i] = min(case1, case2, case3);

        }
        
        System.out.print(min[N]);
        
    }
    
    public static int min(int case1, int case2, int case3){
        int min = case1;
        if(case2<min)
            min = case2;
        if(case3<min)
            min = case3;
        return min;
    }
    
}