package _0001_0100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _0062_UniquePathsTest {

    @Test
    void case1() {
        // Given
        _0062_UniquePaths uniquePaths = new _0062_UniquePaths();
        int m = 3;
        int n = 7;
        int output = 28;

        // When
        int ret = uniquePaths.uniquePaths(m, n);

        // Then
        assertEquals(ret, output);
    }


    @Test
    void case2() {
        // Given
        _0062_UniquePaths uniquePaths = new _0062_UniquePaths();
        int m = 3;
        int n = 2;
        int output = 3;

        // When
        int ret = uniquePaths.uniquePaths(m, n);

        // Then
        assertEquals(ret, output);
    }


    @Test
    void case3() {
        // Given
        _0062_UniquePaths uniquePaths = new _0062_UniquePaths();
        int m = 1;
        int n = 1;
        int output = 1;

        // When
        int ret = uniquePaths.uniquePaths(m, n);

        // Then
        assertEquals(ret, output);
    }
}