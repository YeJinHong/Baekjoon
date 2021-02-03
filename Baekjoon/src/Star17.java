import java.util.Scanner;

public class Star17{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N<1||N>100)
            System.err.print("out of bound");
        for(int i=0; i<N; i++){
        	for(int j=0; j<N+i; j++) {
        		if(i==N-1)
        			System.out.print("*");
        		else if(j==-i+N-1)
        			System.out.print("*");
        		else if(j==i+N-1)
        			System.out.print("*");
        		else
        			System.out.print(" ");
        	}
        	System.out.println();
        }
    }
}