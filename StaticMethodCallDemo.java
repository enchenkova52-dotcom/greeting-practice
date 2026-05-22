StaticMethodCallDemo.javapublic class StaticMethodCallDemo {
    public static void main(String[] args) {
        System.out.println("=== Вариант 1: через имя класса ===");
        A.printVars();
        
        System.out.println("\n=== Вариант 2: через объект класса ===");
        A obj = new A();
        obj.printVars();
        
        System.out.println("\n=== Вариант 3: прямой вызов из статического метода ===");
        A.printVars();
    }
}

class A {
    public static int a = 1;
    public static int b = 10;

    public static void printVars() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}