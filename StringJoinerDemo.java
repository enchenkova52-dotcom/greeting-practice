import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {

        // 1. Простой StringJoiner с разделителем
        StringJoiner sj1 = new StringJoiner(", ");
        sj1.add("Яблоко");
        sj1.add("Груша");
        sj1.add("Апельсин");
        System.out.println("1. " + sj1);

        // 2. StringJoiner с разделителем, префиксом и суффиксом
        StringJoiner sj2 = new StringJoiner(", ", "[", "]");
        sj2.add("Красный");
        sj2.add("Синий");
        sj2.add("Зеленый");
        System.out.println("2. " + sj2);

        // 3. Объединение двух StringJoiner
        StringJoiner sj3 = new StringJoiner(", ", "{", "}");
        sj3.add("Один");
        sj3.add("Два");

        StringJoiner sj4 = new StringJoiner(", ", "{", "}");
        sj4.add("Три");
        sj4.add("Четыре");

        sj3.merge(sj4);
        System.out.println("3. После merge: " + sj3);

        // 4. Пустой StringJoiner
        StringJoiner sj5 = new StringJoiner(" | ");
        System.out.println("4. Пустой: '" + sj5 + "'");
        System.out.println("   Длина: " + sj5.length());

        // 5. StringJoiner с установкой пустого значения
        StringJoiner sj6 = new StringJoiner(", ", "<", ">");
        sj6.setEmptyValue("ПУСТО");
        System.out.println("5. Пустой с setEmptyValue: '" + sj6 + "'");

        // 6. Добавление элементов после установки пустого значения
        sj6.add("Первый");
        sj6.add("Второй");
        System.out.println("6. После добавления: " + sj6);

        // 7. Работа с числами
        StringJoiner sj7 = new StringJoiner(" + ", "", " = Сумма");
        for (int i = 1; i <= 5; i++) {
            sj7.add(String.valueOf(i));
        }
        System.out.println("7. " + sj7);

        // 8. Формирование SQL запроса
        StringJoiner columns = new StringJoiner(", ");
        columns.add("id").add("name").add("age");

        StringJoiner values = new StringJoiner(", ", "(", ")");
        values.add("1").add("'Иван'").add("25");

        String query = "INSERT INTO users (" + columns + ") VALUES " + values;
        System.out.println("8. SQL: " + query);

        // 9. Список email адресов
        StringJoiner emails = new StringJoiner("; ", "<", ">");
        emails.add("user@example.com");
        emails.add("admin@example.com");
        emails.add("support@example.com");
        System.out.println("9. Emails: " + emails);

        // 10. Путь к файлу
        StringJoiner path = new StringJoiner("/");
        path.add("home");
        path.add("user");
        path.add("documents");
        path.add("file.txt");
        System.out.println("10. Путь: " + path);
    }
}