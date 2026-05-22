public class InfiniteLoopsExample {
    public static void main(String[] args) {
        System.out.println("=== Бесконечный while ===");
        System.out.println("// while(true) { }");
        
        System.out.println("\n=== Бесконечный do-while ===");
        System.out.println("// do { } while(true);");
        
        System.out.println("\n=== while с условием которое никогда не станет false ===");
        System.out.println("// int i = 0; while(i < 10) { i--; }");
        
        System.out.println("\n=== do-while с условием которое никогда не станет false ===");
        System.out.println("// int i = 0; do { i--; } while(i < 10);");
        
        System.out.println("\n(Код закомментирован, так как циклы бесконечные)");
        
        // Бесконечный while
        // while(true) {
        //     System.out.println("Бесконечный цикл");
        // }
        
        // Бесконечный do-while
        // do {
        //     System.out.println("Бесконечный цикл");
        // } while(true);
        
        // while с условием которое не изменится
        // int x = 5;
        // while(x < 10) {
        //     System.out.println("x всегда меньше 10");
        // }
    }
}