import java.io.FileInputStream;
import java.io.IOException;

class MyResource implements AutoCloseable {
    public void doWork() {
        System.out.println("Работа с ресурсом");
    }
    
    @Override
    public void close() {
        System.out.println("Ресурс закрыт автоматически");
    }
}

public class AutoCloseableExample {
    public static void main(String[] args) {
        
        // 1. Свой ресурс с AutoCloseable
        try (MyResource res = new MyResource()) {
            res.doWork();
        }
        
        // 2. FileInputStream тоже реализует AutoCloseable
        try (FileInputStream fis = new FileInputStream("test.txt")) {
            int data = fis.read();
            System.out.println("Байт: " + data);
        } catch (IOException e) {
            System.out.println("Файл не найден");
        }
    }
}