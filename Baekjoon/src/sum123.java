import java.util.Scanner;

//9095
public class sum123{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int n;
        
        int d[] = new int[11];
        d[0] = 1;
        d[1] = 1;
        d[2] = d[1]+d[0];
        
        // 어떤 수 i를 1,2,3의 덧셈으로 구성하는 방법은 다음 세가지
        // i-1를 구성하는 방법(끝에 1더하기)
        // i-2를 구성하는 방법(끝에 2더하기)
        // i-3를 구성하는 방법(끝에 3더하기)
        for(int i=3; i<=10; i++){
            d[i] = d[i-1]+d[i-2]+d[i-3];
        }
        
        while(T-->0){
            n = sc.nextInt();
            if(n<1||n>10)
                System.err.println("out of bound");
            System.out.println(d[n]);
        }
    }
}