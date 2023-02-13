//repeatedly selecting the smallest element from the unsorted portion of the list
// and moving it to the sorted portion of the list by swapping the values at the two positions
//Time Complexity: O(n^2)
public class SelectionSort implements SortingAlgorithm {
    public int[] sorty(int[] input) {
        int n = input.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (input[j] < input[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = input[minIndex];
            input[minIndex] = input[i];
            input[i] = temp;
        }
        return input;
    }
}
