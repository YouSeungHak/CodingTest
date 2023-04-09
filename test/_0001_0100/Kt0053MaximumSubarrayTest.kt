package _0001_0100

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Kt0053MaximumSubarrayTest {
    @Test
    fun case1() {
        // Given
        val maximumSubarray = Kt0053MaximumSubarray()
        val arrayNums = intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)
        val output = 6

        // When
        val ret = maximumSubarray.maxSubArray(arrayNums)

        // Then
        Assertions.assertEquals(ret, output)
    }

    @Test
    fun case2() {
        // Given
        val maximumSubarray = Kt0053MaximumSubarray()
        val arrayNums = intArrayOf(1)
        val output = 1

        // When
        val ret = maximumSubarray.maxSubArray(arrayNums)

        // Then
        Assertions.assertEquals(ret, output)
    }

    @Test
    fun case3() {
        // Given
        val maximumSubarray = Kt0053MaximumSubarray()
        val arrayNums = intArrayOf(5, 4, -1, 7, 8)
        val output = 23

        // When
        val ret = maximumSubarray.maxSubArray(arrayNums)

        // Then
        Assertions.assertEquals(ret, output)
    }
}