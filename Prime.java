import java.util.Scanner;
public class Prime{
    public static void main(String[] args) {
        boolean k=true;
        Scanner s=new Scanner(System.in);
        int input=s.nextInt();
        for(int i=2;i<input/2;i++){
            if (input%i==0){
                k=false;
            }
        }
        System.out.println(k);
        s.close();
    }
}