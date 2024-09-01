package challenges;

public class Challenge1 {
    public static void implementChallenge1(int[] arr, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int mid = (start + end) / 2;
        implementChallenge1(arr, start, mid);
        implementChallenge1(arr, mid, end);
        merge(arr, start, mid, end);

        System.out.println("\nChallenge1 => ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        if (arr[mid - 1] >= arr[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[end - start];

        while (i < mid && j < end) {
            temp[tempIndex++] = arr[i] >= arr[j] ? arr[i++] : arr[j++];
        }

        System.arraycopy(arr, i, arr, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, arr, start, tempIndex);
    }
}
