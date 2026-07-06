class Solution {
    public int kthSmallest(int[] arr, int k) {

        int len1 = arr.length;

        // Insertion Sort
        for (int i = 1; i < len1; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        // Copy into another array (your approach)
        int[] arr2 = new int[arr.length];
        int index = 0;

        for (int num : arr) {
            arr2[index] = num;
            index++;
        }

        // Return kth smallest element
        if (k >= 1 && k <= arr2.length) {
            return arr2[k - 1];
        }

        return -1;
    }
}