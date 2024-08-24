import sortAlgorithms.*;

public class Main {
    public static void main(String[] args) {
        int[] array = {64, -34, -25, 12, 22, 11, 90};
        BubbleSort.implementBubbleSort(array);
        SelectionSort.implementSelectionSort(array);
        InsertionSort.implementInsertionSort(array);
        ShellSort.implementShellSort(array);
        Recursion.implementRecursion();
        MergeSort.implementMergeSort(array, 0, array.length );
        QuickSort.implementQuickSort(array, 0, array.length );
        CountingSort.implementCountingSort(array);
    }
}