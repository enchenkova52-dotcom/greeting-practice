public class a {
    public final int a;

    // инициализация через конструктор без параметров
    public a() {
        a = 10;
    }

    // инициализация через конструктор с параметром
    public a(int value) {
        a = value;
    }

    public static void main(String[] args) {
        // создание объекта через конструктор без параметров
        a obj1 = new a();
        // создание объекта через конструктор с параметром
        a obj2 = new a(25);

        System.out.println("obj1.a = " + obj1.a);
        System.out.println("obj2.a = " + obj2.a);

        // obj1.a = 20; // ошибка - final переменную нельзя изменить после инициализации
    }
}