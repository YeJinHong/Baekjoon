package mysolution;
import java.util.Scanner;

public class Justprint{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int linebound = 100;
        String s;
        while(sc.hasNext()&&linebound-->0){
            s = sc.nextLine();
            if(s.length()>=100||s==""&&s.substring(0,1)==" "&&s.substring(s.length()-1)==" ")
                System.err.println();
            
        }
    }
}