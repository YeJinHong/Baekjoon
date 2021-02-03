import java.util.Scanner;

public class Star5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N<1||N>100)
            System.err.println("out of bound");
        for(int i=0; i<N; i++){
            for(int j=0; j<N-i-1; j++)
                System.out.print(" ");
            for(int j=N-i-1; j<N+i; j++)
                System.out.print("*");
            System.out.println("\n");
        }
    }
}