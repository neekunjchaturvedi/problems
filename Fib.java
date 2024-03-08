public class Fib {
    public static int fibr(int n){
        if (n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return fibr(n-1)+fibr(n-2);
        }

    }
    public static void fib(int n){
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        for(int i=2;i<n;i++){
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;

        }
    }
    public static void main(String[] args) {
        int a=5;
        int res =fibr(a);
        fib(a);
        System.out.println(res);

    }
    
}
