public class BooleanCreationExample {
    public static void main(String[] args) {
        Boolean b1 = Boolean.TRUE;
        Boolean b2 = Boolean.FALSE;
        
        Boolean b3 = Boolean.valueOf(true);
        Boolean b4 = Boolean.valueOf(false);
        
        Boolean b5 = Boolean.valueOf("true");
        Boolean b6 = Boolean.valueOf("false");
        Boolean b7 = Boolean.valueOf("TRUE");
        Boolean b8 = Boolean.valueOf("hello");
        
        Boolean b9 = Boolean.parseBoolean("true");
        Boolean b10 = Boolean.parseBoolean("True");
        
        System.out.println("Boolean.TRUE: " + b1);
        System.out.println("Boolean.FALSE: " + b2);
        System.out.println("valueOf(true): " + b3);
        System.out.println("valueOf(false): " + b4);
        System.out.println("valueOf('true'): " + b5);
        System.out.println("valueOf('false'): " + b6);
        System.out.println("valueOf('TRUE'): " + b7);
        System.out.println("valueOf('hello'): " + b8);
        System.out.println("parseBoolean('true'): " + b9);
        System.out.println("parseBoolean('True'): " + b10);
    }
}