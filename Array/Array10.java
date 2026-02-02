import java.util.Scanner;

public class Array10 {
    public static void main(String[] args) {
        int arr[]=new int[10];
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the number:");
        int size=sc.nextInt();

        for(int i=0;i<=size;i++){
            System.out.println("enter the elment of index:" +i);
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.println(arr[i]+"");
        }
    }
    
}
