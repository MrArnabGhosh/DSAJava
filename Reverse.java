import java.util.Scanner;

public class Reverse {
   public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    int n = in.nextInt();
    int[] arr =new int[n];
    for(int i= 0 ; i<arr.length;i++){
    arr[i]=in.nextInt();
    }
    System.out.println("the array is ");
    for (int num : arr) {
       System.out.println(num); 
    }
    System.out.println("The reverse array is ");
    for(int i=arr.length-1;i>=0;i--){
        System.out.println(arr[i]);
    }
    in.close();
   } 
   
}
