import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String []args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        if(a>100)
        	System.err.println("out of bound");
        else if(a>90)
        	System.out.println("A");
        else if(a>80)
        	System.out.println("B");
        else if(a>70)
        	System.out.println("C");
        else if(a>60)
        	System.out.println("D");
        else
        	System.out.println("F");
        }
    
}