public class StringBuilderBufferDemo {
    public static void main(String[] args) {
        
        // Используем StringBuilder (не потокобезопасный, но быстрее)
        StringBuilder sb = new StringBuilder("Hello");
        
        // 1. append() - добавляет строку в конец
        sb.append(" World");
        System.out.println("1. append: " + sb);
        
        // 2. insert() - вставляет строку в указанную позицию
        sb.insert(5, " Java");
        System.out.println("2. insert: " + sb);
        
        // 3. delete() - удаляет символы с start до end
        sb.delete(5, 10);
        System.out.println("3. delete: " + sb);
        
        // 4. deleteCharAt() - удаляет символ по индексу
        sb.deleteCharAt(5);
        System.out.println("4. deleteCharAt: " + sb);
        
        // 5. replace() - заменяет часть строки
        sb.replace(0, 5, "Hi");
        System.out.println("5. replace: " + sb);
        
        // 6. reverse() - переворачивает строку
        sb.reverse();
        System.out.println("6. reverse: " + sb);
        
        // 7. length() - возвращает длину
        System.out.println("7. length: " + sb.length());
        
        // 8. charAt() - возвращает символ по индексу
        System.out.println("8. charAt(2): " + sb.charAt(2));
        
        // 9. indexOf() - возвращает индекс подстроки
        System.out.println("9. indexOf('W'): " + sb.indexOf("W"));
        
        // 10. substring() - возвращает подстроку
        System.out.println("10. substring(0, 3): " + sb.substring(0, 3));
        
        // Демонстрация StringBuffer (потокобезопасный)
        StringBuffer sbf = new StringBuffer("Start");
        
        // capacity() - возвращает текущую вместимость
        System.out.println("\nStringBuffer capacity: " + sbf.capacity());
        
        // ensureCapacity() - увеличивает вместимость
        sbf.ensureCapacity(50);
        System.out.println("After ensureCapacity(50): " + sbf.capacity());
        
        // setCharAt() - заменяет символ по индексу
        sbf.setCharAt(0, 's');
        System.out.println("setCharAt(0, 's'): " + sbf);
        
        // toString() - преобразует в String
        String result = sbf.toString();
        System.out.println("toString(): " + result);
    }
}