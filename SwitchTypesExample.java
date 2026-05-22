public class SwitchTypesExample {
    public static void main(String[] args) {
        System.out.println("=== byte ===");
        byte b = 2;
        switch (b) {
            case 1:
                System.out.println("byte = 1");
                break;
            case 2:
                System.out.println("byte = 2");
                break;
            default:
                System.out.println("byte default");
        }

        System.out.println("\n=== short ===");
        short s = 3;
        switch (s) {
            case 1:
                System.out.println("short = 1");
                break;
            case 2:
                System.out.println("short = 2");
                break;
            default:
                System.out.println("short default");
        }

        System.out.println("\n=== int ===");
        int i = 1;
        switch (i) {
            case 1:
                System.out.println("int = 1");
                break;
            case 2:
                System.out.println("int = 2");
                break;
            default:
                System.out.println("int default");
        }

        System.out.println("\n=== char ===");
        char c = 'B';
        switch (c) {
            case 'A':
                System.out.println("char = A");
                break;
            case 'B':
                System.out.println("char = B");
                break;
            default:
                System.out.println("char default");
        }

        System.out.println("\n=== String (Java 7+) ===");
        String str = "hello";
        switch (str) {
            case "hello":
                System.out.println("String = hello");
                break;
            case "world":
                System.out.println("String = world");
                break;
            default:
                System.out.println("String default");
        }

        System.out.println("\n=== enum ===");
        Day day = Day.MONDAY;
        switch (day) {
            case MONDAY:
                System.out.println("enum = MONDAY");
                break;
            case TUESDAY:
                System.out.println("enum = TUESDAY");
                break;
            default:
                System.out.println("enum default");
        }
    }

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY
    }
}