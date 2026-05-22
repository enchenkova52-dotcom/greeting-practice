class Employee {
    protected String name;
    protected double salary;
    
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public double calculateBonus() {
        return salary * 0.1;
    }
    
    public String getInfo() {
        return name + " (ЗП: " + salary + ")";
    }
}

class RegularEmployee extends Employee {
    public RegularEmployee(String name, double salary) {
        super(name, salary);
    }
    
    @Override
    public double calculateBonus() {
        return salary * 0.1;
    }
}

class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }
    
    @Override
    public double calculateBonus() {
        return salary * 0.2;
    }
}

class Intern extends Employee {
    public Intern(String name, double salary) {
        super(name, salary);
    }
    
    @Override
    public double calculateBonus() {
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new RegularEmployee("Иван", 50000);
        Employee emp2 = new Manager("Мария", 100000);
        Employee emp3 = new Intern("Пётр", 20000);
        
        System.out.println(emp1.getInfo() + " → Бонус: " + emp1.calculateBonus());
        System.out.println(emp2.getInfo() + " → Бонус: " + emp2.calculateBonus());
        System.out.println(emp3.getInfo() + " → Бонус: " + emp3.calculateBonus());
    }
}