public class VarargsOverloadDemo {
    
    public void printStrings(String... strings) {
        System.out.print("String[]: ");
        for (String s : strings) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
    
    public void printInts(int... numbers) {
        System.out.print("int[]: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
    
    public void printDoubles(double... doubles) {
        System.out.print("double[]: ");
        for (double d : doubles) {
            System.out.print(d + " ");
        }
        System.out.println();
    }
    
    public void printWithPrefix(String first, String... rest) {
        System.out.print("first = " + first + ", rest: ");
        for (String s : rest) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        VarargsOverloadDemo obj = new VarargsOverloadDemo();
        
        System.out.println(" перегрузка с String[] ");
        obj.printStrings("a", "b", "c");
        
        System.out.println("\nперегрузка с int[] ");
        obj.printInts(1, 2, 3, 4, 5);
        
        System.out.println("\n перегрузка с double[] ");
        obj.printDoubles(1.1, 2.2, 3.3);
        
        System.out.println("\n метод с first + rest ");
        obj.printWithPrefix("hello", "world", "java", "varargs");
    }
}