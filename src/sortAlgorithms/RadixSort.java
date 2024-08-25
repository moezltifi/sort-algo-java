package sortAlgorithms;

public class RadixSort {
    public static void implementRadixSort(int[] radixArray, int radix, int width) {
         for (int i = 0; i < width; i++) {
            radixSingleSort(radixArray, i, radix);
        }

        System.out.println("\nRadix Sort => ");
        for (int j : radixArray) {
            System.out.print(j + " ");
        }
    }

    public static void radixSingleSort(int[] radixArray, int position, int radix) {
        int numItems = radixArray.length;
        int[] countArray = new int[radix];
        int[] outputArray = new int[numItems];

        for (int value : radixArray) {
            countArray[getDigit(position, value, radix)]++;
        }

        for (int i = 1; i < radix; i++) {
            countArray[i] += countArray[i - 1];
        }

        for (int i = numItems - 1; i >= 0; i--) {
            int digit = getDigit(position, radixArray[i], radix);
            outputArray[countArray[digit] - 1] = radixArray[i];
            countArray[digit]--;
        }

        System.arraycopy(outputArray, 0, radixArray, 0, numItems);
    }

    public static int getDigit(int position, int value, int radix) {
        return (value / (int) Math.pow(radix, position)) % radix;
    }
}
