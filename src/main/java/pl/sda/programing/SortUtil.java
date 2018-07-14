package pl.sda.programing;

import java.util.Arrays;
import java.util.Collections;

public class SortUtil {
    public static int[] insercionSort(int[] initial) {
        int[] ret = initial.clone();

        for (int i = 0; i < initial.length; i++) {
            Pair min = ArrayUtil.findMinimumAndIndex(i, ret);

            int temp = ret[i];
            ret[i] = min.getValue();
            ret[min.getIndex()] = temp;
        }
        return ret;
    }

    public static int[] qucikSort(int[] aArrayToSort) {
        int[] ret = aArrayToSort.clone();
        int pivot = aArrayToSort[aArrayToSort.length - 1];
        int pivotIndex= aArrayToSort.length-1;
        int border = 0;
        for (int i = 0; i < ret.length - 1; i++) {
            if (ret[i] < pivot) {
                border++;
                if (i >= border) {
                    swap(ret, i, border - 1);
                }
            }
        }
        swap(ret, pivotIndex, border);

        qucikSort(aArrayToSort)

        return ret;
    }

    private static void swap(int[] aArray, int a, int b) {
        int temp = aArray[a];
        aArray[a] = aArray[b];
        aArray[b] = temp;
    }


}