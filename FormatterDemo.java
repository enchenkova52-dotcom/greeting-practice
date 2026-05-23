import java.util.Formatter;
import java.util.Date;

public class FormatterDemo {
    public static void main(String[] args) {
        
        // 1. %s - строковое представление
        String name = "Виолетта";
        System.out.printf("1. %%s: Привет, %s!%n", name);
        
        // 2. %d - десятичное целое
        int age = 20;
        System.out.printf("2. %%d: Возраст: %d лет%n", age);
        
        // 3. %f - число с плавающей точкой
        double pi = 3.1415926535;
        System.out.printf("3. %%f: PI = %.2f%n", pi);
        
        // 4. %b - логическое значение
        boolean isStudent = true;
        System.out.printf("4. %%b: Студент? %b%n", isStudent);
        
        // 5. %t - форматирование даты и времени
        Date now = new Date();
        System.out.printf("5. %%t: Сегодня: %tD%n", now);
    }
}