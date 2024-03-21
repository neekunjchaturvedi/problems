import java.util.Scanner;
public class Strsep {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a=new String();
        a=s.nextLine();
        for(int i=0;i<a.length();i++){
            System.out.print(a.charAt(i));
            System.out.print(".");
        }
        s.close();

    }
}
