
public class DecodeExample {
    public static void main(String[] args) {
        Integer dec = Integer.decode("123");
        Integer oct = Integer.decode("0123");
        Integer hex1 = Integer.decode("0x7B");
        Integer hex2 = Integer.decode("#7B");
        Integer neg = Integer.decode("-50");
        
        System.out.println("Decimal: " + dec);
        System.out.println("Octal: " + oct);
        System.out.println("Hex 0x: " + hex1);
        System.out.println("Hex #: " + hex2);
        System.out.println("Negative: " + neg);
        
        Long l = Long.decode("0xFF");
        Short s = Short.decode("010");
        Byte b = Byte.decode("0x7F");
        
        System.out.println("Long: " + l);
        System.out.println("Short: " + s);
        System.out.println("Byte: " + b);
    }
}