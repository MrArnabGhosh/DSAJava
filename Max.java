import java.util.Scanner;

public class Max {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        int maxnum=0;
        int[] max=new int[n];
        for(int i=0;i<max.length;i++){ //taking input
            max[i]=in.nextInt();
        }
        System.out.println("print");
        for(int i=0;i<max.length;i++){ //taking input
            if (max[i]>maxnum) {
                maxnum=max[i];
              
            }
             
        }
        System.out.println(maxnum); 
        in.close();
    }
}