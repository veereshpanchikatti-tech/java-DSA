import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
    
        Scanner sc =new Scanner(System.in);
        int arr[]=new int[5];
        int Sum=0;

        System.out.print("enter the 5 number:");
    
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
            Sum=Sum+arr[i];
        }
        System.out.println("Sum of array elements: " + Sum);
    }
    
}
