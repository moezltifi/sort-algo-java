package sortAlgorithms;

public class CountingSort {
    public static void implementCountingSort(int[] arr) {
        int min = arr[0];
        int max = arr[arr.length - 1];
        int[] countArray = new int[max - min + 1];
        for (int k : arr) {
            countArray[k - min]++;
        }
        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i-min] > 0) {
                arr[j++] = i;
                countArray[i - min]--;
            }
        }

        // Printing the sorted array
        System.out.println("\nCounting Sort => ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
