class Parent {

    public void show() {
        System.out.println("Parent show()");
    }

    public void show(String message) {
        System.out.println("Parent show(String): " + message);
    }

    public int calculate(int a, int b) {
        System.out.print("Parent calculate(int,int): ");
        return a + b;
    }

    public double calculate(double a, double b) {
        System.out.print("Parent calculate(double,double): ");
        return a + b;
    }
}

class Child extends Parent {

    @Override
    public void show() {
        System.out.println("Child show() - переопределен");
    }

    @Override
    public void show(String message) {
        System.out.println("Child show(String) - переопределен: " + message);
    }

    @Override
    public int calculate(int a, int b) {
        System.out.print("Child calculate(int,int) - переопределен: ");
        return a * b;
    }

    public void show(int number) {
        System.out.println("Child show(int) - новая перегрузка: " + number);
    }

    public int calculate(int a, int b, int c) {
        System.out.print("Child calculate(int,int,int) - новая перегрузка: ");
        return a + b + c;
    }
}

public class OverloadingOverrideDemo {
    public static void main(String[] args) {
        System.out.println("=== Перегрузка (overloading) в Parent ===");
        Parent p = new Parent();
        p.show();
        p.show("Hello");
        System.out.println(p.calculate(5, 10));
        System.out.println(p.calculate(5.5, 10.5));

        System.out.println("\n=== Переопределение (override) в Child ===");
        Child c = new Child();
        c.show();
        c.show("Hello");
        System.out.println(c.calculate(5, 10));
        System.out.println(c.calculate(5.5, 10.5));

        System.out.println("\n=== Новая перегрузка в Child ===");
        c.show(100);
        System.out.println(c.calculate(5, 10, 15));

        System.out.println("\n=== Полиморфное поведение ===");
        Parent pc = new Child();
        pc.show();
        pc.show("Test");
        System.out.println(pc.calculate(5, 10));
    }
}