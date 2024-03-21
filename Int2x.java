import java.util.Scanner;;
public class Int2x {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        int x=1;
        int count=0;
        int a=s.nextInt();
        for(int i=0;i<a/10;i++){
            x*=2;
            count++;
            if (x==a){
                break;
            }
        }
        System.out.println(count);
        s.close();
    }
}
