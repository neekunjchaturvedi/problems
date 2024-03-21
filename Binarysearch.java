import java.util.Scanner;
public class Binarysearch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        boolean res=false;
        System.out.println("enter the size");
        int size=s.nextInt();
        int []a=new int[size];
        System.out.println("enter the elements in increasing order");
        for(int i=0;i<size;i++){
            a[i]=s.nextInt();
        }
        System.out.println("enter the target");
        int target=s.nextInt();
        int low=0;
        int high=size;
        while(low<high){
            int mid=(low+high)/2;
            if(a[mid]==target){
                res=true;
            }else if(a[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        if (res){
            System.out.println("Found");
        }
        else{
            System.out.println("Not found");
        }

        s.close();

    }
}
