package sortAlgorithms;

public class QuickSort {
    public static void implementQuickSort(int[] arr, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int pivotIndex = partition(arr, start, end);
        implementQuickSort(arr, start, pivotIndex);
        implementQuickSort(arr, pivotIndex + 1, end);

        System.out.println("\nQuick Sort => ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int i = start, j = end;
        while (i < j) {
            while (i < j && arr[--j] >= pivot);
            if (i < j) {
                arr[i] = arr[j];
            }
            while (i < j && arr[++i] <= pivot);
            if (i < j) {
                arr[j] = arr[i];
            }
        }
        arr[j] = pivot;
        return j;
    }

}
