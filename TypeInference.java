import java.util.ArrayList;
import java.util.HashMap;

public class TypeInference {
    public static void main(String[] args) {
        // var определяет тип автоматически на основе значения

        var number = 42; // int
        var text = "Hello"; // String
        var decimal = 3.14; // double
        var floatValue = 3.14f; // float
        var flag = true; // boolean

        System.out.println("number - " + number + " (тип: int)");
        System.out.println("text - " + text + " (тип: String)");
        System.out.println("decimal - " + decimal + " (тип: double)");
        System.out.println("floatValue - " + floatValue + " (тип: float)");
        System.out.println("flag - " + flag + " (тип: boolean)");

        // var с коллекциями
        var list = new ArrayList<String>();
        list.add("Элемент 1");
        list.add("Элемент 2");

        var map = new HashMap<String, Integer>();
        map.put("one", 1);
        map.put("two", 2);

        System.out.println("\nArrayList: " + list);
        System.out.println("HashMap: " + map);

        // var в цикле for-each
        for (var item : list) {
            System.out.println("Элемент: " + item);
        }
    }
}