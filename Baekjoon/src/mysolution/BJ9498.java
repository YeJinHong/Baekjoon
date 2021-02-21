package mysolution;
import java.io.BufferedReader;
import java.io.InputStreamReader;

//시험 성적
public class BJ9498 {
    public static void main(String []args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        if(a>=90)
        	System.out.println("A");
        else if(a>=80)
        	System.out.println("B");
        else if(a>=70)
        	System.out.println("C");
        else if(a>=60)
        	System.out.println("D");
        else
        	System.out.println("F");
        }
    
}