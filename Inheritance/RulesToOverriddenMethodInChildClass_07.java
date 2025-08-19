class Animal
{
    public void eat()
    {
        System.out.println("Animal Eat EveryDay");

    }
    public void age( int x)
    {
        System.out.println("animal age is :");
    }
}
class Tiger extends Animal
{
    public void eat() //1.) we can not change the visibility(public, protected, default, private) on the time of overriding.
    //2.) you can increase the visibility 
    {
        System.out.println("Tiger hunt and eat");
    }
    // public void age()
    // {
    //     return 10;
    // }

    //3. you can't change the return type of the method
    public void age(int x)
    {

    }
    // Method parameter should be same
}
public class RulesToOverriddenMethodInChildClass_07 {
    public static void main(String[] args) {
        Tiger tg = new Tiger();
        tg.eat();
    }
}
