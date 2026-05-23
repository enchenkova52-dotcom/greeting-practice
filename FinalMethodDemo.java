class Parent {
    public void normalMethod() {
        System.out.println("Обычный метод - можно переопределить");
    }
    
    public final void finalMethod() {
        System.out.println("final метод - нельзя переопределить");
    }
}

class Child extends Parent {
    // Это работает - обычный метод можно переопределить
    @Override
    public void normalMethod() {
        System.out.println("Child переопределил normalMethod");
    }
    
    // ЭТО ОШИБКА! Нельзя переопределить final метод
    // @Override
    // public void finalMethod() {
    //     System.out.println("Попытка переопределить final метод");
    // }
}

public class FinalMethodDemo {
    public static void main(String[] args) {
        Child c = new Child();
        c.normalMethod();
        c.finalMethod();
    }
}