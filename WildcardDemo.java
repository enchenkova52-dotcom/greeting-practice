import java.util.ArrayList;
import java.util.List;

public class WildcardDemo {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        List<Double> doubles = new ArrayList<>();
        List<Number> numbers = new ArrayList<>();

        integers.add(10);
        integers.add(20);
        doubles.add(3.14);
        doubles.add(2.71);
        numbers.add(100);
        numbers.add(200);

        System.out.println("=== <? extends Number> - можно только читать ===");
        printNumbers(integers);
        printNumbers(doubles);
        printNumbers(numbers);

        System.out.println("\n=== <? super Integer> - можно только писать ===");
        addIntegers(numbers);
        addIntegers(integers);
        // addIntegers(doubles); // ошибка - Double не super Integer

        System.out.println("После добавления:");
        for (Number n : numbers) {
            System.out.print(n + " ");
        }
    }

    // <? extends T> - producer (читаем)
    // Можно читать как T, нельзя писать
    public static void printNumbers(List<? extends Number> list) {
        for (Number n : list) {
            System.out.print(n + " ");
        }
        System.out.println();
        // list.add(100); // ошибка - нельзя писать
    }

    // <? super T> - consumer (пишем)
    // Можно писать T и его подтипы, нельзя читать как T
    public static void addIntegers(List<? super Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
        // Integer value = list.get(0); // ошибка - нельзя читать как Integer
    }
}