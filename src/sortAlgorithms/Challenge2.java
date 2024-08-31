package sortAlgorithms;

public class Challenge2 {
    public static void implementChallenge2(int[] arr ,int numItems) {
        if (numItems < 2) {
            return;
        }
        implementChallenge2(arr, numItems - 1);
        int newElement = arr[numItems - 1];
        int i;
        for (i = numItems - 1; i > 0 && arr[i - 1] > newElement; i--) {
            arr[i] = arr[i - 1];
        }
        arr[i] = newElement;
        System.out.println("\nChallenge2 => ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
