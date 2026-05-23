public class MyCustomException extends Exception {

    // 1. Конструктор без параметров
    public MyCustomException() {
        super();
    }

    // 2. Конструктор с сообщением
    public MyCustomException(String message) {
        super(message);
    }

    // 3. Конструктор с сообщением и причиной
    public MyCustomException(String message, Throwable cause) {
        super(message, cause);
    }

    // 4. Конструктор с причиной
    public MyCustomException(Throwable cause) {
        super(cause);
    }
}