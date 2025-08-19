class Parant1 //extend object class
{
    int age = 20;

}
class Parant2
{
    int age = 18;
}
class Child extends Parant1//Parant1,parant2 :- we can not do that because it lead the reason of ambiguity

// also it is not allowed in java syntex
{

}

public class MultipleInheritance_06 { // Diamond Shap Inheritance
    public static void main(String[] args) {
        Animal a = new Animal();
        a.equals(a);
        a.hashCode();
        a.getClass();
        a.sleep();  // these all are methods from the Object class which is default parant class in java of every class.
    }
}

/*
 * when we write a program in java and you are not going to use "extends" key word it means that you are not telling the parant class,
 * But behind the seen Every Parant class in java extends Object class.
 * Object{} :- Parant class of all the classes in java  by default (Inbuild class)
 */
