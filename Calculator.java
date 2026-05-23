public class Calculator {

    // перегрузка по количеству параметров
    public int add(int a, int b) {
        System.out.print("add(int,int): ");
        return a + b;
    }

    public int add(int a, int b, int c) {
        System.out.print("add(int,int,int): ");
        return a + b + c;
    }

    // перегрузка по типу параметров
    public double add(double a, double b) {
        System.out.print("add(double,double): ");
        return a + b;
    }

    // перегрузка по порядку параметров
    public String add(String a, int b) {
        System.out.print("add(String,int): ");
        return a + b;
    }

    public String add(int a, String b) {
        System.out.print("add(int,String): ");
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(5, 10));
        System.out.println(calc.add(5, 10, 15));
        System.out.println(calc.add(5.5, 10.5));
        System.out.println(calc.add("Number: ", 100));
        System.out.println(calc.add(200, " is the value"));
    }
}