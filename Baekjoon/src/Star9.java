import java.util.Scanner;
/*
public class Star9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N<1||N>100)
            System.err.print("out of bound");
        for(int i=0; i<2*N-1; i++){
            for(int j=0; j<2*N-1; j++){
                if(j==i||j==-i+2*N-2)
                    System.out.print("*");
                else if(j<i^j<-i+2*N-2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
*/

public class Star9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N<1||N>100)
            System.err.print("out of bound");
        for(int i=0; i<N; i++){
            for(int j=0; j<i; j++)
                System.out.print(" ");
            for(int j=0; j<2*N-1-2*i; j++)
                System.out.print("*");
            System.out.println();
        }
        for(int i=N-2; i>=0; i--){
            for(int j=0; j<i; j++)
                System.out.print(" ");
            for(int j=0; j<2*N-1-2*i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}