interface MyInterface {

    // default метод
    default void show() {
        System.out.println("Default method from interface");
    }

    // static метод
    static void info() {
        System.out.println("Static method from interface");
    }
}

public class InterfaceMethodsExample implements MyInterface {

    // переопределение default метода
    @Override
    public void show() {
        System.out.println("Overridden method in class");
    }

    public static void main(String[] args) {

        InterfaceMethodsExample obj = new InterfaceMethodsExample();

        // вызов через объект класса
        obj.show();

        // вызов через ссылку интерфейса
        MyInterface ref = new InterfaceMethodsExample();

        ref.show();

        // вызов static метода интерфейса
        MyInterface.info();
    }
}