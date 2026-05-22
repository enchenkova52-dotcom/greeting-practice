import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Введите ваше имя: ");
        String name = scan.nextLine();
        
        System.out.println("Привет, " + name);
        
        scan.close();
    }
}