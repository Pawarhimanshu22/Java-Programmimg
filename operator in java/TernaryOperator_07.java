import java.util.Scanner;

public class TernaryOperator_07 {
  public static void main(String[] args) {
    int a = 19;
    int b = 20;
    int c = 40;
    int res = (a < b) ? a : b;
    System.out.println(res); // 19

    String result = (a < b) ? "a is less" : "b is less";
    System.out.println(result);

    int num = (a < b) ? (a < c ? a : b) : (b < c ? b : c);
    System.out.println(num);

    int x = 10;
    int y = 20;
    int z = (x > y) ? 100 : 200;
    System.out.println(z);
    int m = (x < y) ? 100 : 200;
    System.out.println(m);

    if (a < c) {
      if (a < c) {
        System.out.println(a);
      } else {
        System.out.println(c);
      }
    } else {
      if (b < c) {
        System.out.println(b);
      } else {
        System.out.println();
      }
    }

    /*
     * WAP that gives the following as output-
     * For each multiple of 3, Print "Fizz" instead of Number
     * For each Multiple of 5, Print "Buzz" instead of number
     * For numbers which are multiple of both 3 and 5, print "FizzBuzz" instead of
     * the number
     * otherwise print the Number itself
     */
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number : ");
    int input = scanner.nextInt();
    if (input % 3 == 0 && input % 5 == 0) 
    {
      System.out.println("FizzBuzz");
    } 
    else if (input % 3 == 0) 
    {
      System.out.println("Fizz");
    } else if (input % 5 == 0) 
    {
      System.out.println("Buzz");
    } else 
    {
      System.out.println("nulll");
    }



    
    //WAP that print each number from 1 to 100 on a new line, except if the number is a multiple of 5 and 7
    System.out.println("VERSION 1 :");
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        
        if(number % 5 == 0 && number % 7 == 0) {
            System.out.println("Number " + number + " would be SKIPPED (divisible by both 5 and 7)");
        } else {
            System.out.println("Number " + number + " would be PRINTED");
        }

        System.out.println("VERSION 2 : ");
        for(int i = 1; i <= 100; i++) {
            if(!(i % 5 == 0 && i % 7 == 0)) {
                System.out.println(i);
            }
        }
        
  }
}