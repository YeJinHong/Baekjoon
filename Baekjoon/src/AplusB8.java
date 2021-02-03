import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AplusB8{
    public static void main(String args[]) throws Exception{
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bfr.readLine());
        StringTokenizer st;
        int x = 1;
        while(T-x+1>0){
            st = new StringTokenizer(bfr.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            if(A<0 || B>10)
                System.err.println("out of bound");
            System.out.print("Case #"+x+": ");
            System.out.println(A+" + "+B+" = "+(A+B));
            x++;
        }
        bfr.close();
    }
}