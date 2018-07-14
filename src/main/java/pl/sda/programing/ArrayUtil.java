package pl.sda.programing;

public class ArrayUtil {

    public static int findMinimum(int[] aTable) {
        int min = aTable[0];
        for (int i = 1; i < aTable.length; i++) {
            if (aTable[i] < min) {
                min = aTable[i];
            }
        }
        return min;
    }

    public static Pair findMinimumAndIndex(int[] aTable) {
        int min = aTable[0];
        int index = 0;
        for (int i = 1; i < aTable.length; i++) {
            if (aTable[i] < min) {
                min = aTable[i];
                index = i;
            }
        }
        return new Pair(index, min);
    }

    public static Pair findMinimumAndIndex(int aStartIndex, int[] aTable) {
        int min = aTable[aStartIndex];
        int index = aStartIndex;
        for (int i = aStartIndex+1; i < aTable.length; i++) {
            if (aTable[i] < min) {
                min = aTable[i];
                index = i;
            }
        }
        return new Pair(index, min);
    }

    public static int findMaximum(int[] aTable) {
        int max = aTable[0];
        for (int i = 1; i < aTable.length; i++) {
            if (aTable[i] > max) {
                max = aTable[i];
            }
        }
        return max;
    }
}