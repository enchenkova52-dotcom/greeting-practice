import java.util.ArrayList;
import java.util.List;

public class GenericInstanceofDemo {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();

        // instanceof работает с сырым типом (raw type)
        System.out.println(stringList instanceof List);
        System.out.println(integerList instanceof List);

        // НЕЛЬЗЯ проверить конкретный параметризованный тип
        // System.out.println(stringList instanceof List<String>); // ошибка

        // Обходное решение через ? (wildcard)
        if (stringList instanceof List<?>) {
            System.out.println("stringList is List<?>");
        }

        // Пример с собственным generic классом
        Wrapper<String> strWrapper = new Wrapper<>();
        Wrapper<Integer> intWrapper = new Wrapper<>();

        System.out.println(strWrapper instanceof Wrapper);
        System.out.println(intWrapper instanceof Wrapper);
        System.out.println(strWrapper instanceof Wrapper<?>);
    }
}

class Wrapper<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}