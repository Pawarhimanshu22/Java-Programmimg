public class Typcasting_03 {
    public static void main(String[] args) {
        int a = 30;
        double b;
        b = a;
        System.out.println(b);

        double num1 = 23.4;
        int num2 = 44;
        num2 = (int) num1;
        System.out.println(num2); // Explicit typecasting

        int num3 = 12;
        int num4 = 5;
        float res = num3 / num4;
        System.out.println(res); // truncation

        float var1 = 2.2f;
        float var2 = 33.3f;
        float res3 = var1 = var2;
        float res4 = var1 + var2;
        // System.out.println(res4);
        System.out.println(res4);
        System.out.println(res3);

    }
}
