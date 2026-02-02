import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Simple Calculator");
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.println("Choose an operation: ");
        int choice=sc.nextInt();
        double c=0;

        switch(choice) {
            case 1:
                c=a+b;
                System.out.println("Addition: " + c);
                break;
            case 2:
                c=a-b;
                System.out.println("Subtraction: " + c);
                break;
            case 3:
                c=a*b;
                System.out.println("Multiplication: " + c);
                break;
            case 4:
                c=a/b;
                if(b != 0) {
                    System.out.println("Division: " + c);
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        sc.close();
    }
}
