public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 20;
        int b = 7;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        int x = 10;
        System.out.println("x++ = " + (x++));
        System.out.println("После x++: x = " + x);

        int y = 10;
        System.out.println("++y = " + (++y));
        System.out.println("После ++y: y = " + y);

        int p = 10;
        System.out.println("p-- = " + (p--));
        System.out.println("После p--: p = " + p);

        int q = 10;
        System.out.println("--q = " + (--q));
        System.out.println("После --q: q = " + q);

        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a <= b: " + (a <= b));

        int c = 6;
        int d = 4;
        System.out.println("c & d = " + (c & d));
        System.out.println("c | d = " + (c | d));
        System.out.println("c ^ d = " + (c ^ d));
        System.out.println("~c = " + (~c));
        System.out.println("c << 1 = " + (c << 1));
        System.out.println("c >> 1 = " + (c >> 1));
        System.out.println("c >>> 1 = " + (c >>> 1));

        boolean t = true;
        boolean f = false;
        System.out.println("t && f: " + (t && f));
        System.out.println("t || f: " + (t || f));
        System.out.println("!t: " + (!t));

        int age = 20;
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println(result);

        int val = 15;
        val += 5;
        System.out.println("+= : " + val);
        val -= 3;
        System.out.println("-= : " + val);
        val *= 2;
        System.out.println("*= : " + val);
        val /= 4;
        System.out.println("/= : " + val);
        val %= 3;
        System.out.println("%= : " + val);

        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1 + " " + s2;
        System.out.println(s3);

        String msg = "Value: ";
        msg += 100;
        System.out.println(msg);

        System.out.println("Number: " + 42);
        System.out.println("Pi: " + 3.14);
        System.out.println("Flag: " + true);
    }
}