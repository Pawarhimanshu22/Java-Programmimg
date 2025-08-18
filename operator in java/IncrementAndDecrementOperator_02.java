public class IncrementAndDecrementOperator_02 {

    public static void main(String[] args) {
        int a1 = 10;
        int b1 = 2;

        a1++; // 11
        System.out.println(a1++);// 11
        System.out.println(a1);// 12

        // in post increment, values used for computing and then increment the value

        System.out.println(a1++ + b1); // 14

        System.out.println("Pay Attention here : " + a1);

        int g = 90;
        int f = 2;
        System.out.println(g--); //90
        // it is using original value not previous value
        System.out.println(g-- + f); // 91

        System.out.println("Pay Attension here : " + g); //88

        int a = 20;
        System.out.println(a);
        a++; // post increment

        System.out.println(a);
        a--; // post decrement

        System.out.println(a);
        a--;
        System.out.println(a);

        int b = 20;
        b++; // Post increment
        System.out.println(b);
        ++b; // Preincrement
        System.out.println(b);

        b--;
        System.out.println(b);
        --b; // pre decrement

        System.out.println(b);

        int c = 5;
        int d = c++;
        System.out.println("Value of c :"+c); //6
        System.out.println("Value of d :"+d);// 5

        int h = 5;
        int i = ++h;
        System.out.println(h); //6
        System.out.println(i);//6

        int x = 5;
        int y = x++ + ++x + --x;
        System.out.println("Value of x :"+x);
        System.out.println("Value of y :"+y);

        int m = 5;
        int n;
        n = m++ + ++m + ++m + m++ + --m + m--;
        System.out.println(m); // 7
        System.out.println(n); // 44


        int aa = 5;
        int bb = aa++ + ++aa + --aa;
        System.out.println(aa);
        System.out.println(bb);

        int aa1 = 7;
        int bb1 = aa1++ + ++aa1 + ++aa1 + aa1++ + --aa1 + aa1--;
        System.out.println(aa1);
        System.out.println(bb1);



        // Pre increment - first increase the value and than use 

        // Post Increament - first use the value and than INCREMENT it

        //Pre Decreament - first decrement the value and than use it

        // Post Decreament - first use the value and than DECREMENT it

    }
}
