public class NarrowingConversion {
    public static void main(String[] args) {
        // double -> int
        double pi = 3.14159;
        int intPi = (int) pi;
        System.out.println("double 3.14159 -> int: " + intPi);

        // long -> byte
        long bigNumber = 1000L;
        byte smallByte = (byte) bigNumber;
        System.out.println("long 1000 -> byte: " + smallByte);

        // int -> short
        int largeInt = 40000;
        short shortValue = (short) largeInt;
        System.out.println("int 40000 -> short: " + shortValue);

        // float -> int
        float floatValue = 9.99f;
        int intValue = (int) floatValue;
        System.out.println("float 9.99 -> int: " + intValue);

        // char -> byte
        char letter = 'A';
        byte byteLetter = (byte) letter;
        System.out.println("char 'A' (" + (int) letter + ") -> byte: " + byteLetter);
    }
}