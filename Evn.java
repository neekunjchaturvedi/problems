import java.util.Scanner;
public class Evn {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int []a=new int[size];
        int []even=new int [size];
        for(int i=0;i<a.length;i++){
            a[i]=s.nextInt();
        }
        for(int i=0;i<a.length;i++){
            if (a[i]%2==0){
                even[i]=a[i];
            }
        }
        for(int i=0;i<a.length;i++){
            if (even[i]!=0){
                System.out.print(even[i]+" ");
            }
        }
        s.close();
        
    }
}
