import java.util.Date;

public class DateTimeFormatDemo {
    public static void main(String[] args) {
        Date now = new Date();
        
        // 1. %tH - час (00-23)
        System.out.printf("1. %%tH: %tH часов%n", now);
        
        // 2. %tM - минуты (00-59)
        System.out.printf("2. %%tM: %tM минут%n", now);
        
        // 3. %tS - секунды (00-59)
        System.out.printf("3. %%tS: %tS секунд%n", now);
        
        // 4. %tB - полное название месяца
        System.out.printf("4. %%tB: Месяц: %tB%n", now);
        
        // 5. %tA - полное название дня недели
        System.out.printf("5. %%tA: День недели: %tA%n", now);
    }
}