class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}

public class InstanceofDemo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        
        System.out.println(animal instanceof Animal);
        System.out.println(dog instanceof Dog);
        System.out.println(dog instanceof Animal);
        System.out.println(cat instanceof Animal);
        
        Animal pet = new Dog();
        System.out.println(pet instanceof Animal);
        System.out.println(pet instanceof Dog);
        System.out.println(pet instanceof Cat);
        
        Animal empty = null;
        System.out.println(empty instanceof Animal);
        System.out.println(empty instanceof Object);
        System.out.println(null instanceof String);
        
        String[] words = new String[3];
        System.out.println(words instanceof Object);
        System.out.println(words instanceof String[]);
        
        Animal[] zoo = {new Dog(), new Cat(), new Animal()};
        for (Animal a : zoo) {
            if (a instanceof Dog) {
                System.out.println("Found Dog");
            } else if (a instanceof Cat) {
                System.out.println("Found Cat");
            } else {
                System.out.println("Unknown animal");
            }
        }
    }
}