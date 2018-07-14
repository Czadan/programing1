package pl.sda.programing;

import org.junit.jupiter.api.Test;


import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortUtilTest {

    @Test
    void shouldReturnSortedAscArray() {
        //given
        int[] initial = {9, 1, 3, 7, 5, 2, 6, 8, 4};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        //when
        int[] sorted = SortUtil.insercionSort(initial);

        //then
        System.out.println(Arrays.toString(sorted));
        assertArrayEquals(expected, sorted);
        int[] notSorted = {9, 1, 3, 7, 5, 2, 6, 8, 4};
      //  assertArrayEquals(notSorted, initial);
    }

    @Test
    void shouldReturnSortedByQuickSort() {
        //given
        int[] initial = {9, 1, 3, 7, 5, 2, 6, 8, 4};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        //when
        int[] sorted = SortUtil.qucikSort(initial);

        //then
        System.out.println(Arrays.toString(sorted));
        assertArrayEquals(expected, sorted);
        int[] notSorted = {9, 1, 3, 7, 5, 2, 6, 8, 4};
        //  assertArrayEquals(notSorted, initial);
    }
}
