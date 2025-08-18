import java.util.Scanner;

public class DOWhileLoop10 {
    public static void main(String[] args) {
        int x = 0;
        do{
            System.out.println("*" );
            x++;
        }
        while(x<7);
        {
            System.out.println("*");
        }



// print the sum of 10 natural number using the while loop

// Method 1: Sum of first 10 natural numbers using do-while loop
        int i = 1;
        int sum = 0;
        
        System.out.println("Calculating sum of first 10 natural numbers:");
        
        do {
            sum = sum + i;
            System.out.println("Adding " + i + ", current sum: " + sum);
            i++;
        } while (i <= 10);
        
        System.out.println("Final sum of first 10 natural numbers: " + sum);
        System.out.println();
        
        // Method 2: User input version - sum of first N natural numbers using do-while
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find sum of first N natural numbers: ");
        int n = scanner.nextInt();
        
        int j = 1;
        int userSum = 0;
        
        do {
            userSum = userSum + j;
            j++;
        } while (j <= n);
        
        System.out.println("Sum of first " + n + " natural numbers: " + userSum);
        
        scanner.close();
    
    }
}
