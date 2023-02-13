//works by dividing an array into smaller subarrays,
// sorting each subarray, and then merging the sorted subarrays back together to form the final sorted array.
//Time Complexity: O(N log(N))
public class MergeSort implements SortingAlgorithm {
    public int[] sorty(int[] input) {
        mergeSort(input, 0, input.length - 1);
        return input;
    }

    private void mergeSort(int[] input, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(input, low, mid);
            mergeSort(input, mid + 1, high);
            merge(input, low, mid, high);
        }
    }

    private void merge(int[] input, int low, int mid, int high) {
        int leftSize = mid - low + 1;
        int rightSize = high - mid;
        int[] left = new int[leftSize];
        int[] right = new int[rightSize];

        for (int i = 0; i < leftSize; i++) {
            left[i] = input[low + i];
        }

        for (int j = 0; j < rightSize; j++) {
            right[j] = input[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = low;

        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                input[k] = left[i];
                i++;
            } else {
                input[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < leftSize) {
            input[k] = left[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            input[k] = right[j];
            j++;
            k++;
        }
    }
}
