import java.util.Scanner;

public class WhillLoop_11 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 11) {
            System.out.print("*");
            i++;
        }
        
System.out.println(" ");
// Print the First 10 Natural Number 
        int j = 0;
        while (j <= 10) {
            System.out.println(j + " ");
        j++;
        }


// Print the sum of 'n' natual number using a for loop, where n is the

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        
        int sum = 0;
        int p = 1;  
        while(p <= n) {
            sum = sum + p;  
            p++; 
        }

        System.out.println("Sum of first " + n + " natural numbers = " + sum);
        
        int formulaResult = (n * (n + 1)) / 2;
        System.out.println("Verification using formula n(n+1)/2 = " + formulaResult);
        
        scanner.close();



/*
     * WAP that gives the following as output-
     * For each multiple of 3, Print "Fizz" instead of Number
     * For each Multiple of 5, Print "Buzz" instead of number
     * For numbers which are multiple of both 3 and 5, print "FizzBuzz" instead of
     * the number
     * otherwise print the Number itself
     */


        int x = 0;
    while (x <= 100) {
        if(x % 3 == 0) {
            System.out.println("Fizz");
        }
        else if (x % 5 == 0) {
            System.out.println("Buzz");
        }
        else if (x % 3 == 0 && x % 5 == 0)
        {
            System.out.println("FizzBuzz");
        }
        else
        {
            System.out.println("null");
        }
        x++;
    }
    }
}
