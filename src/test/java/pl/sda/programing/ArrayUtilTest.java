package pl.sda.programing;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayUtilTest {

    @Test
    void shouldReturnMinimum() {
        //given
        int[] initial = {9, 1, 3, 7, 5, 2, 6, 8, 4};

        //when
        int ret = ArrayUtil.findMinimum(initial);

        //then
        System.out.println("min: "+ ret);
        assertEquals(1, ret);
    }

    @Test
    void shouldReturnMinimumAndIndex() {
        //given
        int[] initial = {9, 1, 3, 7, 5, 2, 6, 8, 4};

        //when
        Pair ret = ArrayUtil.findMinimumAndIndex(initial);

        //then
        assertEquals(new Pair(1, 1), ret);
    }

    @Test
    void shouldReturnMinimumAndIndexWithExcludeIndexZero() {
        //given
        int[] initial = {1, 2, 3, 7, 5, 9, 6, 8, 4};

        //when
        int startIndex = 2;
        Pair ret = ArrayUtil.findMinimumAndIndex(startIndex, initial);

        //then
        assertEquals(new Pair(2, 3), ret);
    }

    @Test
    void shouldReturnMaximum() {
        //given
        int[] initial = {9, 1, 3, 7, 5, 2, 6, 8, 4};

        //when
        int ret = ArrayUtil.findMaximum(initial);

        //then
        System.out.println("min: "+ ret);
        assertEquals(9, ret);
    }
}