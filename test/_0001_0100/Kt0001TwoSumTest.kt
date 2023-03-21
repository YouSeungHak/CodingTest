package _0001_0100

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class Kt0001TwoSumTest {

    @Test
    fun twoSumWithHash() {
        val twoSum = Kt0001TwoSum()
        assertArrayEquals(twoSum.twoSumWithHash(intArrayOf(2, 7, 11, 15), 9), intArrayOf(0, 1))
        assertArrayEquals(twoSum.twoSumWithHash(intArrayOf(3, 2, 4), 6), intArrayOf(1, 2))
        assertArrayEquals(twoSum.twoSumWithHash(intArrayOf(3, 3), 6), intArrayOf(0, 1))
    }

    @Test
    fun twoSum() {
        val twoSum = Kt0001TwoSum()
        assertArrayEquals(twoSum.twoSum(intArrayOf(2, 7, 11, 15), 9), intArrayOf(0, 1))
        assertArrayEquals(twoSum.twoSum(intArrayOf(3, 2, 4), 6), intArrayOf(1, 2))
        assertArrayEquals(twoSum.twoSum(intArrayOf(3, 3), 6), intArrayOf(0, 1))
    }
}