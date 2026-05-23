class Parent {
    protected String name = "Родитель";

    Parent() {
        System.out.println("Конструктор Parent без параметров");
    }

    Parent(String name) {
        this.name = name;
        System.out.println("Конструктор Parent с параметром: " + name);
    }

    void show() {
        System.out.println("Метод show() из Parent");
    }
}

class Child extends Parent {
    String name = "Ребенок";

    Child() {
        super(); // 1. вызов конструктора суперкласса без параметров
        System.out.println("Конструктор Child");
    }

    Child(String name) {
        super(name); // 1. вызов конструктора суперкласса с параметром
        System.out.println("Конструктор Child с параметром: " + name);
    }

    void show() {
        super.show(); // 3. доступ к методу суперкласса
        System.out.println("Метод show() из Child");
    }

    void printNames() {
        System.out.println("super.name = " + super.name); // 2. доступ к полю суперкласса
        System.out.println("this.name = " + this.name); // поле текущего класса
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        System.out.println("=== Создание Child() ===");
        Child c1 = new Child();
        c1.show();
        c1.printNames();

        System.out.println("\n=== Создание Child(\"Имя\") ===");
        Child c2 = new Child("Имя");
        c2.show();
        c2.printNames();
    }
}