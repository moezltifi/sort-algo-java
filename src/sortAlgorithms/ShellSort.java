package sortAlgorithms;

public class ShellSort {
    public static void implementShellSort(int[] arr) {

        for (int gap = arr.length/2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length ; i++) {
                int newElement = arr[i];
                int j = i ;
                while (j >= gap && arr[j-gap] > newElement) {
                    arr[j] = arr[j-gap];
                    j = j-gap;
                }
            }

        }
        System.out.println("\nShell Sort => ");
        for (int j : arr) {
            System.out.print(j + " ");
        }

    }
}
