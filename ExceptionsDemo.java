public class ExceptionsDemo {
    public static void main(String[] args) {
        
        // 1. ArithmeticException - деление на ноль
        System.out.println("1. ArithmeticException");
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль - " + e.getMessage());
        }
        
        // 2. ArrayIndexOutOfBoundsException - выход за границы массива
        System.out.println("\n 2. ArrayIndexOutOfBoundsException");
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: индекс за пределами массива - " + e.getMessage());
        }
        
        // 3. IllegalArgumentException - неверный аргумент
        System.out.println("\n 3. IllegalArgumentException");
        try {
            setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: неверный аргумент - " + e.getMessage());
        }
        
        // 4. ClassCastException - неверное приведение типов
        System.out.println("\n 4. ClassCastException ");
        try {
            Object obj = "Hello";
            Integer num = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("Ошибка: нельзя привести тип - " + e.getMessage());
        }
        
        // 5. NullPointerException - обращение к null объекту
        System.out.println("\n 5. NullPointerException ");
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Ошибка: обращение к null объекту - " + e.getMessage());
        }
    }
    
    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным: " + age);
        }
        System.out.println("Возраст установлен: " + age);
    }
}