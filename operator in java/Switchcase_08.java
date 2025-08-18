import java.util.Scanner;

public class Switchcase_08 {
    public static void main(String[] args) {
        int num = 2000;

        switch (num) {
            case 200:System.out.println("Case 1");
            break;

            case 300:System.out.println("Case 2");
            break;

            case 100:System.out.println("case 3");
                break;
            
            default : System.out.println("default");
        }


        //Write a program using switch statement to check if the input lowercase character is vowel or consonent
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a lowercase character: ");
        char ch = scanner.next().charAt(0);
        
        // Check if the character is a lowercase letter
        if (ch >= 'a' && ch <= 'z') {
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("'" + ch + "' is a vowel.");
                    break;
                default:
                    System.out.println("'" + ch + "' is a consonant.");
                    break;
            }
        } else {
            System.out.println("Error: Please enter a lowercase letter only.");
        }
        
        




        // WAP to print the day name based upon the day number 

        System.out.println("Enter a number between 1 to 7 (1 and 7 included) : ");
        int number = scanner.nextInt();
        if (number <= 7) 
        {
            switch (number) {
            case 1: System.out.println("Monday");
                break;
            case 2 : System.out.println("Tuesday");
                break;
            case 3 : System.out.println("Wednesday");
                break;
            case 4 : System.out.println("Thursday");
                break;
            case 5:System.out.println("Friday");
                break;
            case 6 : System.out.println("Saturday");
                break;
            case 7 : System.out.println("Sunday");
                break;
        
            default:
                break;
        }
        }
        else
        {
            System.out.println("Invailid input !");
        }
    }
}
