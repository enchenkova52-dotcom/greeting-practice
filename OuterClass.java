public class OuterClass {
    private String privateField = "приватное поле";
    protected String protectedField = "защищенное поле";
    public String publicField = "публичное поле";
    String defaultField = "поле по умолчанию";

    // public внутренний класс - доступен везде
    public class PublicInner {
        public void display() {
            System.out.println("public inner: " + publicField);
        }
    }

    // private внутренний класс - доступен только внутри OuterClass
    private class PrivateInner {
        public void display() {
            System.out.println("private inner: " + privateField);
        }
    }

    // protected внутренний класс - доступен в пакете и подклассам
    protected class ProtectedInner {
        public void display() {
            System.out.println("protected inner: " + protectedField);
        }
    }

    // default (package-private) - доступен только в пакете
    class DefaultInner {
        public void display() {
            System.out.println("default inner: " + defaultField);
        }
    }

    public void testAccess() {
        // внутри внешнего класса доступны все внутренние
        PrivateInner pi = new PrivateInner();
        pi.display();

        DefaultInner di = new DefaultInner();
        di.display();
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();

        // public - доступен
        PublicInner pub = outer.new PublicInner();
        pub.display();

        // private - НЕ доступен извне
        // PrivateInner priv = outer.new PrivateInner(); // ОШИБКА!

        // protected - доступен в том же пакете
        ProtectedInner prot = outer.new ProtectedInner();
        prot.display();

        // default - доступен в том же пакете
        DefaultInner def = outer.new DefaultInner();
        def.display();
    }
}