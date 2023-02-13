//Like Merge Sort, QuickSort is a Divide and Conquer algorithm.
// It picks an element as a pivot and partitions the given array around the picked pivot.

public class QuickSort implements SortingAlgorithm {
    public int[] sorty(int[] input) {
        quickSort(input, 0, input.length - 1);
        return input;
    }

    private void quickSort(int[] input, int low, int high) {   //recursiive
        if (low < high) {
            int pivotIndex = partition(input, low, high);
            quickSort(input, low, pivotIndex - 1);
            quickSort(input, pivotIndex + 1, high);
        }
    }

    private int partition(int[] input, int low, int high) {
        int pivot = input[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (input[j] <= pivot) {
                i++;
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
            }
        }
        int temp = input[i + 1];
        input[i + 1] = input[high];
        input[high] = temp;
        return i + 1;
    }
}
