public class AllDataTypes {

    static byte defaultByte;
    static short defaultShort;
    static int defaultInt;
    static long defaultLong;
    static float defaultFloat;
    static double defaultDouble;
    static char defaultChar;
    static boolean defaultBoolean;

    public static void main(String[] args) {

        byte byteValue = 127;
        short shortValue = 32000;
        int intValue = 2147483647;
        long longValue = 9223372036854775807L;

        float floatValue = 3.14f;
        double doubleValue = 3.141592653589793;

        char charValue = 'A';

        boolean booleanValue = true;

        System.out.println("=== Инициализированные переменные ===");
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char: " + charValue);
        System.out.println("boolean: " + booleanValue);

        System.out.println("\n=== Нулевые значения членов класса ===");
        System.out.println("default byte: " + defaultByte);
        System.out.println("default short: " + defaultShort);
        System.out.println("default int: " + defaultInt);
        System.out.println("default long: " + defaultLong);
        System.out.println("default float: " + defaultFloat);
        System.out.println("default double: " + defaultDouble);
        System.out.println("default char: '" + defaultChar + "' (код: " + (int) defaultChar + ")");
        System.out.println("default boolean: " + defaultBoolean);
    }
}