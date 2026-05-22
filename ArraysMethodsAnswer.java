import java.util.Arrays;

public class ArraysMethodsAnswer {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
        
        System.out.println("toString: " + Arrays.toString(arr));
        
        Arrays.sort(arr);
        System.out.println("sort: " + Arrays.toString(arr));
        
        int index = Arrays.binarySearch(arr, 8);
        System.out.println("binarySearch 8: index " + index);
        
        int[] arr2 = {1, 2, 5, 8, 9};
        System.out.println("equals: " + Arrays.equals(arr, arr2));
        
        System.out.println("compare: " + Arrays.compare(arr, arr2));
    }
}