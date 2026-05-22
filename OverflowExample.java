public class OverflowExample {
    public static void main(String[] args) {
        int a = 120;

        // byte b = a + 10; // ОШИБКА! int не может быть автоматически преобразован в
        // byte

        byte b = a + 10; // ЕСЛИ РАСКОММЕНТИРОВАТЬ - ОШИБКА КОМПИЛЯЦИИ

        byte c = (byte) (a + 10); // 130 -> переполнение: 130 - 256 = -126

        // byte d = a + 1; // ОШИБКА! int не может быть автоматически преобразован в
        // byte

        System.out.println("int a = " + a);
        System.out.println("a + 10 = " + (a + 10));
        System.out.println("byte c = (byte)(a + 10) = " + c);
        System.out.println("\nОбъяснение:");
        System.out.println(
                "1. byte b = a + 10; - ошибка, потому что a + 10 дает int, а int в byte автоматически не преобразуется");
        System.out.println(
                "2. byte c = (byte)(a + 10); - a + 10 = 130. byte хранит -128..127, происходит переполнение: 130 - 256 = -126");
        System.out.println("3. byte d = a + 1; - аналогично ошибка, требуется явное приведение");
    }
}