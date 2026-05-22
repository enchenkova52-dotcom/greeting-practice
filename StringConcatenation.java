public class StringConcatenation {
    public static void main(String[] args) {
        String name = "Виолетта";
        int age = 20;
        double height = 165.5;
        boolean isStudent = true;
        char grade = 'A';

        System.out.println("Привет, " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Рост: " + height + " см");
        System.out.println("Студент: " + isStudent);
        System.out.println("Оценка: " + grade);
        System.out.println("Сумма: " + (10 + 20) + " рублей");
        System.out.println("Результат: " + (age + 5));
    }
}