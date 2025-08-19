class Animal{
    void sleep()
    {
        System.out.println("Animal also need sleep");

    }
}
class Tiger extends Animal
{

}
class Monkey extends Animal
{

}
class Deer extends Animal
{

}
// One parant class ki multiple child class ho sakti h 

public class HeirarchicalInheritance_05 {
    public static void main(String[] args) {
        Deer obj = new Deer();
        obj.sleep();

    }
}
