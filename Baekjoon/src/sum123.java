import java.util.Scanner;

//9095
public class sum123{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int n;
        
        int d[] = new int[11];
        d[0] = 1;
        d[1] = 1;
        d[2] = d[1]+d[0];
        
        // � �� i�� 1,2,3�� �������� �����ϴ� ����� ���� ������
        // i-1�� �����ϴ� ���(���� 1���ϱ�)
        // i-2�� �����ϴ� ���(���� 2���ϱ�)
        // i-3�� �����ϴ� ���(���� 3���ϱ�)
        for(int i=3; i<=10; i++){
            d[i] = d[i-1]+d[i-2]+d[i-3];
        }
        
        while(T-->0){
            n = sc.nextInt();
            if(n<1||n>10)
                System.err.println("out of bound");
            System.out.println(d[n]);
        }
    }
}