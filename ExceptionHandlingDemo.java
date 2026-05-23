public class ExceptionHandlingDemo {
    
    // метод, который выбрасывает исключение (не перехватывает)
    public static void causeArithmeticException() {
        int a = 10;
        int b = 0;
        int result = a / b;  // ArithmeticException - приведет к аварийной остановке
        System.out.println(result);
    }
    
    // метод, который перехватывает исключение
    public static void handleArrayException() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);  // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Перехвачено: " + e);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Перехваченное исключение ===");
        handleArrayException();
        
        System.out.println("\n=== Неперехваченное исключение ===");
        causeArithmeticException();  // здесь программа упадет
        
        System.out.println("Этот код не выполнится");
    }
}