package sortAlgorithms;


public class SelectionSort {
    public static void implementSelectionSort(int[] arr) {


        int lastUnsortedIndex;
        for (lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for (int i = 0; i <= lastUnsortedIndex; i++) {
                if (arr[i] > arr[largest]) {
                    largest = i;
                }
            }
            swap(arr, largest, lastUnsortedIndex);
        }
        System.out.println("\nSelection Sort => ");
        for (int j : arr) {
            System.out.print(j + " ");
        }

    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
