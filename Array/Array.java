import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc =new scanner(System.in);
        int n=5;
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        int arr3[]=new int[n];

        System.out.println("Enter elements of first array:");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        
        System.out.println("Enter elements of second array:");
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        System.out.println("Sum of corresponding elements of both arrays:");
        for(int i=0;i<n;i++){
            arr3[i]=arr1[i]+arr2[i];
            System.out.println(arr3[i]);
        }
        sc.close();
    
        
    }
    
}
