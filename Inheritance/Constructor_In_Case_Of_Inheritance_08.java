class Demo1
{
    int a,b; //Instance variable
    public Demo1()
    {
        System.out.println("Parent class constructor");
    }
    
    public Demo1(int x , int y)
    {
        System.out.println("Parameterized parent class constructor");
        a = x;  // Correct assignment
        b = y;  // Correct assignment
    }
}
class Demo2 extends Demo1{
    int m,n;
    public Demo2()
    {
        // Uncomment one of these to test different constructor calls:
        // this(123,55);     // Call parameterized constructor of same class
        // super();          // Call default constructor of parent (automatic)
        // super(10,20);     // Call parameterized constructor of parent
        System.out.println("Child class constructor");
    }
    
    public Demo2(int x , int y)
    {
        System.out.println("Parameterized child class constructor");
    }
}
public class Constructor_In_Case_Of_Inheritance_08 {
    public static void main(String[] args) {
        
        Demo2 d = new Demo2(); // constructor call {child class constructor}
        // Demo2 d2 = new Demo2(10,30);  // Uncomment to test parameterized constructor
    }
}