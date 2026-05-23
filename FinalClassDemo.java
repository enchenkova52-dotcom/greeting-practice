final class FinalClass {
    public void someMethod() {
        System.out.println("Метод final класса");
    }
}

// ЭТО ОШИБКА! Нельзя создать подкласс от final класса
// class ImpossibleChild extends FinalClass {
//     
// }

class NormalClass {
    public void normalMethod() {
        System.out.println("Обычный класс");
    }
}

// Это работает - от обычного класса можно наследовать
class NormalChild extends NormalClass {
    @Override
    public void normalMethod() {
        System.out.println("Наследник обычного класса");
    }
}

public class FinalClassDemo {
    public static void main(String[] args) {
        FinalClass fc = new FinalClass();
        fc.someMethod();
        
        NormalChild nc = new NormalChild();
        nc.normalMethod();
    }
}