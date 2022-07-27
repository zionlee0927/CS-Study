import Algorithm.MergeSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {21,10,12,20,25,13,15};
        MergeSort mergeSort = new MergeSort();

        int[] sorted = mergeSort.mergeSort_TopDown(array);
        System.out.println(Arrays.toString(sorted));
    }

}
