interface InterfaceA {

    default void print() {
        System.out.println("Method from InterfaceA");
    }
}

interface InterfaceB {

    default void print() {
        System.out.println("Method from InterfaceB");
    }
}

public class MultipleInterfacesExample
        implements InterfaceA, InterfaceB {

    // разрешение конфликта
    @Override
    public void print() {

        InterfaceA.super.print();
        InterfaceB.super.print();

        System.out.println("Method from class");
    }

    public static void main(String[] args) {

        MultipleInterfacesExample obj =
                new MultipleInterfacesExample();

        obj.print();
    }
}