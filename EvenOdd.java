import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        
        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);
        
        // Declare variable
        int num;
        
        // Take input from user
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        
        // Check even or odd using modulus operator
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
        
        // Close scanner
        sc.close();
    }
}
