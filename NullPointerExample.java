public class NullPointerExample {
    public static void main(String[] args) {
        Integer nullInteger = null;
        
        try {
            int x = nullInteger;
        } catch (NullPointerException e) {
            System.out.println("Unboxing null -> NullPointerException");
        }
        
        try {
            Integer y = nullInteger + 5;
        } catch (NullPointerException e) {
            System.out.println("Operation with null -> NullPointerException");
        }
        
        Integer valid = 10;
        int z = valid;
        System.out.println("Valid unboxing: " + z);
    }
}