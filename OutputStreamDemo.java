import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDemo {
    public static void main(String[] args) {
        
        // демонстрация метода write(int)
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            
            // write(int) - записывает один байт (младшие 8 бит)
            fos.write(72);  // H
            fos.write(101); // e
            fos.write(108); // l
            fos.write(108); // l
            fos.write(111); // o
            fos.write(32);  // пробел
            fos.write(87);  // W
            fos.write(111); // o
            fos.write(114); // r
            fos.write(108); // l
            fos.write(100); // d
            fos.write(33);  // !
            
            System.out.println("Данные записаны в файл output.txt");
            
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }
        
        // проверка записи
        try (java.io.FileInputStream fis = new java.io.FileInputStream("output.txt")) {
            int data;
            System.out.print("\nСодержимое файла: ");
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
    }
}