class  Demo1
{
    void disp()
    {
        System.out.println("Disp in demo 1 class");
    }

}
class Demo2 extends Demo1
{

}
class Demo3 extends Demo2
{

}
class Demo4 extends Demo3
{
    
}
public class MultiLevelInheritance_04 
{
    public static void main(String[] args) 
    {
        Demo4 obj = new Demo4();
        obj.disp();
    }
}
