public class CustomExceptionDemo {

    public static void validateAge(int age) throws MyCustomException {
        if (age < 0 || age > 150) {
            throw new MyCustomException("Недопустимый возраст: " + age);
        }
        System.out.println("Возраст корректен: " + age);
    }

    public static void main(String[] args) {

        // Обработка собственного исключения
        try {
            validateAge(-5);
        } catch (MyCustomException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }

        try {
            validateAge(25);
        } catch (MyCustomException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Пример с причиной
        try {
            try {
                int a = 10 / 0;
            } catch (ArithmeticException e) {
                throw new MyCustomException("Ошибка при вычислении", e);
            }
        } catch (MyCustomException e) {
            System.out.println("Исключение с причиной: " + e.getMessage());
            System.out.println("Причина: " + e.getCause());
        }
    }
}