public class SwitchFallThroughExample {
    public static void main(String[] args) {
        System.out.println("=== Пример с break ===");
        testWithBreak(2);

        System.out.println("\n=== Пример без break (fall-through) ===");
        testWithoutBreak(2);

        System.out.println("\n=== Демонстрация fall-through для всех значений ===");
        for (int val = 1; val <= 4; val++) {
            testWithoutBreak(val);
            System.out.println();
        }
    }

    public static void testWithBreak(int value) {
        int i = 0;
        switch (value) {
            case 1:
                i = 1;
                System.out.println("case 1: i = " + i);
                break;
            case 2:
                i = 2;
                System.out.println("case 2: i = " + i);
                break;
            case 3:
                i = 3;
                System.out.println("case 3: i = " + i);
                break;
            default:
                i = 4;
                System.out.println("default: i = " + i);
                break;
        }
    }

    public static void testWithoutBreak(int value) {
        int i = 0;
        switch (value) {
            case 1:
                i = 1;
                System.out.println("case 1: i = " + i);
            case 2:
                i = 2;
                System.out.println("case 2: i = " + i);
            case 3:
                i = 3;
                System.out.println("case 3: i = " + i);
                break;
            default:
                i = 4;
                System.out.println("default: i = " + i);
                break;
        }
    }
}