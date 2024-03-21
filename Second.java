public class Second {
    public static void main(String[] args) {
        int []a={2,5,1,7,4,9};
        int count=0;
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                count=i;
            }
        }
        a[count]=0;
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);

    }
}
