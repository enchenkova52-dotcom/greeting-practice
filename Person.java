public class Person {
    private String name;
    private int age;
    private String passportId;
    
    public Person(String name, int age, String passportId) {
        this.name = name;
        this.age = age;
        this.passportId = passportId;
    }
    
    @Override
    public boolean equals(Object obj) {
        // 1. Сравнение с самим собой
        if (this == obj) {
            return true;
        }
        
        // 2. Проверка на null
        if (obj == null) {
            return false;
        }
        
        // 3. Проверка типа
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        // 4. Приведение типа
        Person other = (Person) obj;
        
        // 5. Сравнение значимых полей
        return passportId != null && passportId.equals(other.passportId);
    }
    
    public static void main(String[] args) {
        Person p1 = new Person("Иван", 25, "1234");
        Person p2 = new Person("Иван", 25, "1234");
        Person p3 = new Person("Петр", 30, "5678");
        
        System.out.println("p1 equals p2: " + p1.equals(p2));
        System.out.println("p1 equals p3: " + p1.equals(p3));
        System.out.println("p1 equals null: " + p1.equals(null));
        System.out.println("p1 equals p1: " + p1.equals(p1));
    }
}