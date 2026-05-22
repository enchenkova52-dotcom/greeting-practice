public class BreakContinueExample {
    public static void main(String[] args) {
        System.out.println("=== break - выход из цикла ===");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("break на i = " + i);
                break;
            }
            System.out.println("i = " + i);
        }
        
        System.out.println("\n=== continue - пропуск итерации ===");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("continue для i = " + i);
                continue;
            }
            System.out.println("Нечетное i = " + i);
        }
        
        System.out.println("\n=== break в while ===");
        int j = 1;
        while(j <= 10) {
            if (j == 5) {
                System.out.println("break на j = " + j);
                break;
            }
            System.out.println("j = " + j);
            j++;
        }
        
        System.out.println("\n=== continue в do-while ===");
        int k = 0;
        do {
            k++;
            if (k == 3 || k == 6) {
                System.out.println("continue для k = " + k);
                continue;
            }
            System.out.println("k = " + k);
        } while(k < 8);
        
        System.out.println("\n=== break в бесконечном цикле ===");
        int counter = 0;
        while(true) {
            counter++;
            System.out.println("Итерация: " + counter);
            if (counter >= 5) {
                System.out.println("Выход из бесконечного цикла");
                break;
            }
        }
    }
}