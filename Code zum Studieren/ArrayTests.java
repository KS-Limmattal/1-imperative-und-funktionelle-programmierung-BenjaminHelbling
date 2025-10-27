import java.util.Arrays;

public class ArrayTests {
    static void syntax() {
        int[] a;
        a = new int[3];
        System.out.println(Arrays.toString(a));
        a[0] = 5;
        a[1] = 2 + 2;
        a[2] = a.length;
        System.out.println(Arrays.toString(a));
        a = new int[] { -5, 1 };
        System.out.println(Arrays.toString(a));
        int[] b = { 1, 2, 1 };
        System.out.println(Arrays.toString(b));
        // a = { 1, 2, 1 };
    }

    static void memory() {
        double[] a = { 0.5, 2.71828, 1/10, 2.75};
        double[] b = { 0.5, 2.71828, 1/10, 2.75};
        System.out.println(a);
        System.out.println(b);
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));
        System.out.println((a == b) + "\n"); // + "\n" fügt lediglich einen zusätzlichen Zeilenumbruch ein.

        b[2] = 3.14159;
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));
        System.out.println((a == b) + "\n");

        b = a;
        System.out.println(a);
        System.out.println(b);
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));
        System.out.println((a == b) + "\n");

        b[2] = 3.14159;
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));
        System.out.println((a == b) + "\n");
    }



    public static void main(String[] args) {
        // syntax();
        // memory();
        double[] a = { 0.5, 2.71828, 1/10, 2.75};
        double[] b = { 0.5, 2.71828, 1/10, 2.75};
        double[][] c = {a, b};
        double[][] d = c.clone();
        // d[0][0] = 2;
        d[0] = new double[] {0, 0};
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));
        System.out.println(c[0][0]);
    

    }
}
 