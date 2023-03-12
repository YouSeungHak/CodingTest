package _0001_0100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _0001_TwoSumTest {

    @Test
    void twoSumWithHashCase1() {
        _0001_TwoSum twoSum = new _0001_TwoSum();
        assertArrayEquals(twoSum.twoSumWithHash(new int[] {2, 7, 11, 15}, 9), new int[] {0, 1});
        assertArrayEquals(twoSum.twoSumWithHash(new int[] {3, 2, 4}, 6),new int[] {1, 2});
        assertArrayEquals(twoSum.twoSumWithHash(new int[] {3, 3}, 6),new int[] {0, 1});
    }

    @Test
    void twoSumCase1() {
        _0001_TwoSum twoSum = new _0001_TwoSum();
        assertArrayEquals(twoSum.twoSum(new int[] {2, 7, 11, 15}, 9), new int[] {0, 1});
        assertArrayEquals(twoSum.twoSum(new int[] {3, 2, 4}, 6),new int[] {1, 2});
        assertArrayEquals(twoSum.twoSum(new int[] {3, 3}, 6),new int[] {0, 1});
    }
}