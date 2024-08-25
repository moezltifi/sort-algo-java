import sortAlgorithms.*;

public class Main {
    public static void main(String[] args) {
        int[] array = {64, -34, -25, 12, 22, 11, 90};
        int[] radixArray = {6544, 3784, 2597, 1523, 1522, 7811, 1990};
        BubbleSort.implementBubbleSort(array);
        SelectionSort.implementSelectionSort(array);
        InsertionSort.implementInsertionSort(array);
        ShellSort.implementShellSort(array);
        Recursion.implementRecursion();
        MergeSort.implementMergeSort(array, 0, array.length );
        QuickSort.implementQuickSort(array, 0, array.length );
        CountingSort.implementCountingSort(array);
        RadixSort.implementRadixSort(radixArray, 10, 4 );
    }
}