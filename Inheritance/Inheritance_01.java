class Human
{
    int age;
    void sleep()
    {
        age = 19;
        System.out.println("Human need good sleep");
        System.out.println(age);
    }
}
class Student extends Human
{

}
public class Inheritance_01 {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.sleep();

    }
}
