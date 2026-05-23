public class Outer {
    private String privateField = "private";
    protected String protectedField = "protected";
    public String publicField = "public";
    String defaultField = "default";
    private static String staticField = "static";

    // Нестатический внутренний класс
    class Inner {
        public void accessOuterFields() {
            // Доступ ко всем полям внешнего класса (любые спецификаторы)
            System.out.println("Доступ к private: " + privateField);
            System.out.println("Доступ к protected: " + protectedField);
            System.out.println("Доступ к public: " + publicField);
            System.out.println("Доступ к default: " + defaultField);
            System.out.println("Доступ к static: " + staticField);
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = outer.new Inner();
        inner.accessOuterFields();
    }
}