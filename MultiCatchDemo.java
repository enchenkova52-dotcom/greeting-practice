public class MultiCatchDemo {
    
    // иерархия исключений
    static class Ex1 extends Exception {
        Ex1(String msg) { super(msg); }
    }
    
    static class Ex2 extends Ex1 {
        Ex2(String msg) { super(msg); }
    }
    
    static class Ex3 extends Ex2 {
        Ex3(String msg) { super(msg); }
    }
    
    public static void main(String[] args) {
        
        // 1. несколько исключений обрабатываются одинаково
        System.out.println(" Одинаковая обработка");
        String[] inputs = {"not a number", "0", "5"};
        
        for (String input : inputs) {
            try {
                int num = Integer.parseInt(input);
                int result = 100 / num;
                System.out.println("Результат: " + result);
                
            } catch (NumberFormatException | ArithmeticException e) {
                System.out.println("Обработано: " + e.getClass().getSimpleName() + " - " + e.getMessage());
            }
        }
        
        // 2. иерархия исключений (Ex3 <- Ex2 <- Ex1)
        System.out.println("\n Иерархия исключений");
        
        try {
            throw new Ex3("Исключение Ex3");
            // throw new Ex2("Исключение Ex2");
            // throw new Ex1("Исключение Ex1");
            
        } catch (Ex3 e) {
            System.out.println("Поймано Ex3: " + e.getMessage());
        } catch (Ex2 e) {
            System.out.println("Поймано Ex2: " + e.getMessage());
        } catch (Ex1 e) {
            System.out.println("Поймано Ex1: " + e.getMessage());
        }
        
        // 3. неправильный порядок (выдаст ошибку компиляции)
        System.out.println("\n Неправильный порядок (закомментировано) ");
        System.out.println("// catch (Ex1 e) {}  catch (Ex3 e) {} - так нельзя!");
        System.out.println("// Потому что Ex3 подкласс Ex1, и первый catch перехватит всё");
    }
}