package _0001_0100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _0075_SortColorsTest {

    @Test
    void case1() {
        // Given
        _0075_SortColors sortColors = new _0075_SortColors();
        int[] nums = {2, 0, 2, 1, 1, 0};
        int[] output = {0, 0, 1, 1, 2, 2};

        // When
        int[] retData = sortColors.sortColors(nums);

        // Then
        assertArrayEquals(output, retData);
    }

    @Test
    void case2() {
        // Given
        _0075_SortColors sortColors = new _0075_SortColors();
        int[] nums = {2, 0, 1};
        int[] output = {0, 1, 2};

        // When
        int[] retData = sortColors.sortColors(nums);

        // Then
        assertArrayEquals(output, retData);
    }
}