package Algorithm;

import java.util.Arrays;

public class MergeSort {
    private int[] sorted;

    public int[] mergeSort_TopDown(int[] array){
        sorted = new int[array.length];
        mergeSort_TopDown(array, 0, array.length-1);
        sorted = null;

        return array;
    }

    private void mergeSort_TopDown(int[] a, int left, int right){
        if (left >= right) return;

        int mid = (left + right) / 2;

        mergeSort_TopDown(a, left, mid);
        mergeSort_TopDown(a, mid + 1 , right);
        merge(a, left, mid, right);
    }

    private void merge(int[] a, int left, int mid, int right) {
        int l = left;
        int r = mid + 1;
        int idx = left;

        while (l <= mid && r <= right) {
            if (a[l] <= a[r]) {
                sorted[idx++] = a[l++];
            } else {
                sorted[idx++] = a[r++];
            }
        }

        if (l > mid) {
            while (r <= right) {
                sorted[idx++] = a[r++];
            }
        } else {
            while (l <= mid) {
                sorted[idx++] = a[l++];
            }
        }

        for (int i = left; i <= right; i++) {
            a[i] = sorted[i];
        }
    }


}
