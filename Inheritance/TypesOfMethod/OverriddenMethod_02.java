package TypesOfMethod;

class AeroPlane
{
    public void takeOff()
    {
        System.out.println("Aeroplane is taking of");  // overriddern method
    }
    public void fly()
    {
        System.out.println("Aeroplane is plying"); // overridden method
    }
}
class Cargoplane extends AeroPlane
{
    public void fly()
    {
        System.out.println("Cargoplane flies at lower height");   // overridin Method
    }
    

}
class Passangerplane extends AeroPlane
{
    public void fly()
    {
        System.out.println("Passenger plane flies at lower height");   // overridin Method
    }

}



public class OverriddenMethod_02 {
    public static void main(String[] args) {
        Cargoplane cp = new Cargoplane();
        cp.takeOff();
        cp.fly();

        Passangerplane pp = new Passangerplane();
        pp.takeOff();
        pp.fly();
    }
}
