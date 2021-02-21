package mysolution;
import java.util.Scanner;

// º° Âï±â - 12
public class BJ2522{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N<1||N>100)
            System.err.print("out of bound");
        for(int i=0; i<2*N-1; i++){
            for(int j=0; j<N; j++){
                if(j>=i-N+1&&j>=-i+N-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}