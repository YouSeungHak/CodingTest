package _0001_0100

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Kt0062UniquePathsTest {
    @Test
    fun case1() {
        // Given
        val uniquePaths = Kt0062UniquePaths()
        val m = 3
        val n = 7
        val output = 28

        // When
        val ret = uniquePaths.uniquePaths(m, n)

        // Then
        Assertions.assertEquals(ret, output)
    }


    @Test
    fun case2() {
        // Given
        val uniquePaths = Kt0062UniquePaths()
        val m = 3
        val n = 2
        val output = 3

        // When
        val ret = uniquePaths.uniquePaths(m, n)

        // Then
        Assertions.assertEquals(ret, output)
    }


    @Test
    fun case3() {
        // Given
        val uniquePaths = Kt0062UniquePaths()
        val m = 1
        val n = 1
        val output = 1

        // When
        val ret = uniquePaths.uniquePaths(m, n)

        // Then
        Assertions.assertEquals(ret, output)
    }
}