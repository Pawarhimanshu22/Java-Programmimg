public class ConditionalStatementIfElse_06 {
    public static void main(String[] args) {
        // int age = 18;
        int age1 = 17;
        if (age1 >= 18) {
            System.out.println("Legal Adult");
        } else {
            System.out.println("Child");
        }

        int age2 = 7; // you can change the value of age and you get different different out put

        if (age2 >= 18 && age2 < 60) 
        {
            System.out.println("You Are An Adult");
        } 
        else if (age2 >= 60)
        {
            System.out.println(" You Are a Old Man now ");
        } 
        else 
        {
            System.out.println("You are a child now");
        }

        int age = 18;

        if (age >= 18 && age < 60) 
        {
            if (age > 20 && age < 30) 
            {
                System.out.println("you are in your 20's");
            } 
            else if (age >= 30 && age <= 40) 
            {
                System.out.println("you are in your 30's ");
            } 
            else 
            {
                System.out.println("you are stilll a Man");
            }

        } 
        else if (age > 60) 
        {
            System.out.println("you are an onld man");
        } 
        else if (age >= 16 && age < 18) 
        {
            System.out.println("you are a teenager");
        } 
        else 
        {
            System.out.println(" you are still a keed");
        }
System.out.println("**********************************************************************");



        int a = 10;
        if (a == 10) {
            System.out.println("Dairy milk mil gai......"); 
        }
        else
        {
            System.out.println("Chocolate nahi mili yarr.....");
        }
    }
}
