class Animal //Parant Class
{
    void sleep()
    {
        System.out.println("animal need sleep");

    }
}
class Tiger extends Animal{ // child class

}

public class SingleInheritance_03 {
    public static void main(String[] args) {
        Tiger obj = new Tiger();
        obj.sleep();
    }
}
