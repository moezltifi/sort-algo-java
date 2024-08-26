package sortAlgorithms;

import java.util.Arrays;

public class JDKSort {
    public static void implementJDKSort(int[] arr) {
        Arrays.sort(arr);

        System.out.println("\nJDK Sort => ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
