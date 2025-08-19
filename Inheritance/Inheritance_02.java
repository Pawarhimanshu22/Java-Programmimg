import java.util.jar.Attributes.Name;

class Human
{
    private String name; // private member of a class will not participte in inheritance.
    int age;

    Human() //Constructor also not participate in Inheritance
    {
        System.out.println("Human Class Constructor");
    }

    void sleep()
    {
        age = 19;
        System.out.println("Human need good sleep");
        System.out.println(age);
    
    }
}
class Student extends Human
{
    //  public Student()  
    //  {
    //     super();
    //  }
    void disp()
    {
        System.out.println("The age is :" + age);
        //System.out.println("The Name is :" + Name);
    }

}
public class Inheritance_02 {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.sleep();
        obj.disp();

    }
}

/*
 * super() :- Always call the constructor of Parant class
 * Object creation pe Constructor call hota h,
 * aur agar us class me koi constructor nahi huaa to JVM ek default contrusctor banayenga,
 * aur ye defauly constructor ki super() method call hongi jo ki usake parant class ke constructor ko call karengi.
 */