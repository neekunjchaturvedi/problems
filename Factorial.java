import java.util.Scanner;
public class Factorial {
    public static int fact(int n){
        int res=1;
        for(int i=1;i<=n;i++){
            res*=i;
        }
        return res;
    }
    public static int factr(int n){
        if( n==1){
            return 1;
        }else if (n==0){
            return 1;
        }
        return n*factr(n-1);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        System.out.println(fact(num));
        System.out.println(factr(num));
        s.close();
    }
}
