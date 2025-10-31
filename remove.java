import java.util.*;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        System.out.println("Array after removing duplicates:");
        for (int num : set) {
            System.out.print(num + " ");
        }
        System.out.println();
        sc.close();
    }
}
