package _0001_0100;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _0053_MaximumSubarrayTest {
    @Test
    void case1() {
        // Given
        _0053_MaximumSubarray maximumSubarray = new _0053_MaximumSubarray();
        int[] arrayNums = {-2,1,-3,4,-1,2,1,-5,4};
        int output = 6;

        // When
        int ret = maximumSubarray.maxSubArray(arrayNums);

        // Then
        assertEquals(ret, output);
    }

    @Test
    void case2() {
        // Given
        _0053_MaximumSubarray maximumSubarray = new _0053_MaximumSubarray();
        int[] arrayNums = {1};
        int output = 1;

        // When
        int ret = maximumSubarray.maxSubArray(arrayNums);

        // Then
        assertEquals(ret, output);
    }

    @Test
    void case3() {
        // Given
        _0053_MaximumSubarray maximumSubarray = new _0053_MaximumSubarray();
        int[] arrayNums = {5,4,-1,7,8};
        int output = 23;

        // When
        int ret = maximumSubarray.maxSubArray(arrayNums);

        // Then
        assertEquals(ret, output);
    }
}
