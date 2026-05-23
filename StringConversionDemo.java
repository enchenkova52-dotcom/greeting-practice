public class StringConversionDemo {
    public static void main(String[] args) {
        
        // Исходная строка
        String original = "Hello Java";
        System.out.println("Исходная: " + original);
        
        // 1. String -> StringBuilder
        StringBuilder sb = new StringBuilder(original);
        System.out.println("\n1. String -> StringBuilder: " + sb);
        
        // 2. String -> StringBuffer
        StringBuffer sbf = new StringBuffer(original);
        System.out.println("2. String -> StringBuffer: " + sbf);
        
        // 3. StringBuilder -> String
        String fromSb = sb.toString();
        System.out.println("3. StringBuilder -> String: " + fromSb);
        
        // 4. StringBuffer -> String
        String fromSbf = sbf.toString();
        System.out.println("4. StringBuffer -> String: " + fromSbf);
        
        // 5. StringBuilder -> StringBuffer
        StringBuffer fromSbToSbf = new StringBuffer(sb);
        System.out.println("5. StringBuilder -> StringBuffer: " + fromSbToSbf);
        
        // 6. StringBuffer -> StringBuilder
        StringBuilder fromSbfToSb = new StringBuilder(sbf);
        System.out.println("6. StringBuffer -> StringBuilder: " + fromSbfToSb);
        
        // 7. StringBuilder -> String через конструктор String
        String strFromSb = new String(sb);
        System.out.println("7. StringBuilder -> String (через new String): " + strFromSb);
        
        // 8. StringBuffer -> String через конструктор String
        String strFromSbf = new String(sbf);
        System.out.println("8. StringBuffer -> String (через new String): " + strFromSbf);
        
        // 9. StringBuilder -> String через метод substring
        String sub = sb.substring(0);
        System.out.println("9. StringBuilder -> String через substring(): " + sub);
        
        // 10. StringBuffer -> String через метод substring
        String sub2 = sbf.substring(0);
        System.out.println("10. StringBuffer -> String через substring(): " + sub2);
    }
}