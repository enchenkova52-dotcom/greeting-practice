public class BlockScope {
    public static void main(String[] args) {
        int a = 1;
        {
            int b = 2;
        }
        // int c = a + b; // ОШИБКА! Переменная b не видна вне блока

        System.out.println("Переменная a = " + a);
        System.out.println("Переменная b не существует вне блока {}");
        System.out.println("Код int c = a + b; выдаст ошибку компиляции");
        System.out.println("Потому что область действия переменной b ограничена блоком {}");
    }
}