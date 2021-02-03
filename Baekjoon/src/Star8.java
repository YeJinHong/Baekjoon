import java.util.Scanner;

public class Star8{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N<1||N>100)
            System.err.println("out of bound");
        for(int i=0; i<2*N-1; i++){
            for(int j=0; j<2*N; j++){
                if(i>=j&&j<-i+2*N-1)
                    System.out.print("*");
                else if(i<j&&j>=-i+2*N-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}