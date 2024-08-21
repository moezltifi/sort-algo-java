package sortAlgorithms;

public class InsertionSort {
    public static void implementInsertionSort(int[] arr) {

        int firstUnsortedIndex;
        for (firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++) {

            int newElement = arr[firstUnsortedIndex];
            int i;
            for ( i = firstUnsortedIndex; i > 0 && arr[i-1] > newElement; i--) {
                arr[i] = arr[i-1];
            }
            arr[i] = newElement;
        }
        System.out.println("\nInsertion Sort => ");
        for (int j : arr) {
            System.out.print(j + " ");
        }

    }

}
