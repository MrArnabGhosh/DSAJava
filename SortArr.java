import java.util.Arrays;
import java.util.Scanner;

public class SortArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = in.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the Elements of Array");
        for(int i =0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted Array is :");
        for(int num:arr){
            System.out.println(num + " ");
        }
    }
}
