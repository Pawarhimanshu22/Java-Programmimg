public class AssignmentOperator_03 {
    public static void main(String[] args) {

        //Assignment Operator
        int age;
        age = 19;
        System.out.println(age);

        int aage;
        int cost;
        int rant;

        // int aage,cost,rant;

        int m1;
        int m2;
        int m3;
        int m4;
        m1 = 10;
        m2 = 10;
        m3 = 10;
        m4 = 10;

        // m1 = m2 = m3 = m4 = 10;
        System.out.println(m1 + " " + m2 + " " + m3 + " " + m4);

        int x = 5;
        x += 10; // compound operator
        int y = 10;
        y += 50;
        System.out.println("Value of x :"+x);
        System.out.println("Value of y :"+y);


        int m = 33;
        m *= 10;
        System.out.println(m);

        int n = 30;
        n /= 2;
        System.out.println(n);
        
        int v = 60;
        v %= 6;
        System.out.println(v);


        //Relational Operator
        int a, b, c;
        a = 10;
        b = 20;
        c = 10;

        System.out.println("a == b :" + (a == b));
        System.out.println("a == c  :" + (a == c));
        System.out.println("a != b  :" + (a != b));
        System.out.println("a > b   :" + (a > b));
        System.out.println("a < b    :" + (a < b));
        System.out.println("a >= c  :" + (a >= c));
        System.out.println("a <= b  :" + (a <= b));

    }
}
