import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamDemo {
    public static void main(String[] args) {
        
        // создаем тестовый файл
        try {
            java.io.FileWriter writer = new java.io.FileWriter("test.txt");
            writer.write("Hello Java!");
            writer.close();
        } catch (IOException e) {
            System.out.println("Ошибка создания файла");
        }
        
        // демонстрация метода read()
        try (FileInputStream fis = new FileInputStream("test.txt")) {
            int data;
            
            System.out.println("=== Чтение файла через read() ===");
            
            // read() - возвращает следующий байт или -1 если достигнут конец
            while ((data = fis.read()) != -1) {
                System.out.println("Байт: " + data + " -> Символ: " + (char) data);
            }
            
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
    }
}