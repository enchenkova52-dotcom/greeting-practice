public class AccessModifiersDemo {

    public String publicField = "public - доступно всем";
    protected String protectedField = "protected - доступно в пакете и подклассам";
    String defaultField = "default (без спецификатора) - доступно только в пакете";
    private String privateField = "private - только внутри класса";

    public static void main(String[] args) {
        AccessModifiersDemo obj = new AccessModifiersDemo();

        System.out.println("=== Из того же класса ===");
        System.out.println("public: " + obj.publicField);
        System.out.println("protected: " + obj.protectedField);
        System.out.println("default: " + obj.defaultField);
        System.out.println("private: " + obj.privateField);

        System.out.println("\n=== private ===");
        System.out.println("Доступен только внутри этого класса");

        System.out.println("\n=== default (без спецификатора) ===");
        System.out.println("Доступен классам в том же пакете");

        System.out.println("\n=== protected ===");
        System.out.println("Доступен в том же пакете и подклассам в других пакетах");

        System.out.println("\n=== public ===");
        System.out.println("Доступен всем классам в любых пакетах");
    }
}