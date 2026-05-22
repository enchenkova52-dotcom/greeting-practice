public class TernaryOperatorExample {
    public static void main(String[] args) {
        int a = 2;
        
        int i = (a == 1) ? 1 : (a == 2) ? 2 : 3;
        
        System.out.println("a = " + a);
        System.out.println("i = " + i);
        
        int[] testValues = {1, 2, 3};
        for (int val : testValues) {
            int result = (val == 1) ? 1 : (val == 2) ? 2 : 3;
            System.out.println("a = " + val + " -> i = " + result);
        }
    }
}