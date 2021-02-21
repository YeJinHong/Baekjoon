package mysolution;
import java.util.Scanner;

//º° Âï±â - 16
public class BJ10991{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N<1||N>100)
            System.err.print("out of bound");
        for(int i=0; i<N; i++){
            for(int j=0; j<N-i-1; j++)
                System.out.print(" ");
            for(int j=0; j<i+1; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}