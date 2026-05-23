public class StringMethodsDemo {
    public static void main(String[] args) {

        String str = "  Hello Java World  ";

        // 1. length() - возвращает длину строки
        System.out.println("1. length(): " + str.length());

        // 2. charAt() - возвращает символ по индексу
        System.out.println("2. charAt(6): " + str.charAt(6));

        // 3. toLowerCase() - преобразует строку в нижний регистр
        System.out.println("3. toLowerCase(): " + str.toLowerCase());

        // 4. toUpperCase() - преобразует строку в верхний регистр
        System.out.println("4. toUpperCase(): " + str.toUpperCase());

        // 5. trim() - удаляет пробелы в начале и конце
        System.out.println("5. trim(): '" + str.trim() + "'");

        // 6. substring() - возвращает подстроку от индекса до конца
        System.out.println("6. substring(6): " + str.substring(6));

        // 7. replace() - заменяет символы
        System.out.println("7. replace('o', '0'): " + str.replace('o', '0'));

        // 8. contains() - проверяет наличие подстроки
        System.out.println("8. contains('Java'): " + str.contains("Java"));

        // 9. equals() - сравнивает строки
        String str2 = "  Hello Java World  ";
        System.out.println("9. equals(str2): " + str.equals(str2));

        // 10. split() - разбивает строку на массив
        String[] words = str.trim().split(" ");
        System.out.println("10. split(): ");
        for (String w : words) {
            System.out.println("    " + w);
        }
    }
}