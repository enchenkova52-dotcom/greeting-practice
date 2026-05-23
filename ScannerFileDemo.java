import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFileDemo {
    public static void main(String[] args) {
        
        // создаем тестовый файл
        try (java.io.FileWriter writer = new java.io.FileWriter("data.txt")) {
            writer.write("10 20 30\n");
            writer.write("Hello Java\n");
            writer.write("40 50 60");
        } catch (java.io.IOException e) {
            System.out.println("Ошибка создания файла");
        }
        
        // чтение данных из файла с помощью Scanner
        try (Scanner scanner = new Scanner(new File("data.txt"))) {
            
            // чтение целых чисел
            System.out.println("Чтение чисел ");
            int sum = 0;
            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                sum += num;
                System.out.println("Число: " + num);
            }
            System.out.println("Сумма: " + sum);
            
            // чтение строк
            System.out.println("\nЧтение строк ");
            scanner.nextLine(); // переход на следующую строку
            String line = scanner.nextLine();
            System.out.println("Строка: " + line);
            
            // чтение оставшихся чисел
            System.out.println("\n Оставшиеся числа");
            while (scanner.hasNextInt()) {
                System.out.println("Число: " + scanner.nextInt());
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}