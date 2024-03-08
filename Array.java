public class Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = sumArray(arr, arr.length - 1);
        System.out.println("Sum of array elements: " + sum);
    }

    public static int sumArray(int[] arr, int index) {
        if (index ==0) {
            return 1;
        }
        return arr[index] + sumArray(arr, index - 1);
    }
}
