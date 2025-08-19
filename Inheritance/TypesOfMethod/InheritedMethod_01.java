package TypesOfMethod;


class AeroPlane
{
    public void takeOff()
    {
        System.out.println("Aeroplane is taking of");
    }
    public void fly()
    {
        System.out.println("Aeroplane is plying");
    }
}
class Cargoplane extends AeroPlane
{

}
class Passangerplane extends AeroPlane
{

}
public class InheritedMethod_01 {
    public static void main(String[] args) {
        Cargoplane cp = new Cargoplane();
        cp.takeOff();
        cp.fly();

        Passangerplane pp = new Passangerplane();
        pp.takeOff();
        pp.fly();

    }
}
