package _0101_0200;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class _0122_BestTimeToBuyAndSellStock2Test {
    @Test
    void case1() {
        // Given
        _0122_BestTimeToBuyAndSellStock2 bestTimeToBuyAndSellStock2 = new _0122_BestTimeToBuyAndSellStock2();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int output = 7;

        // When
        int ret = bestTimeToBuyAndSellStock2.maxProfit(prices);

        // Then
        assertEquals(output, ret);
    }
    @Test
    void case2() {
        // Given
        _0122_BestTimeToBuyAndSellStock2 bestTimeToBuyAndSellStock2 = new _0122_BestTimeToBuyAndSellStock2();
        int[] prices = {1, 2, 3, 4, 5};
        int output = 4;

        // When
        int ret = bestTimeToBuyAndSellStock2.maxProfit(prices);

        // Then
        assertEquals(output, ret);
    }
    @Test
    void case3() {
        // Given
        _0122_BestTimeToBuyAndSellStock2 bestTimeToBuyAndSellStock2 = new _0122_BestTimeToBuyAndSellStock2();
        int[] prices = {7, 6, 4, 3, 1};
        int output = 0;

        // When
        int ret = bestTimeToBuyAndSellStock2.maxProfit(prices);

        // Then
        assertEquals(output, ret);
    }
    @Test
    void case4() {
        // Given
        _0122_BestTimeToBuyAndSellStock2 bestTimeToBuyAndSellStock2 = new _0122_BestTimeToBuyAndSellStock2();
        int[] prices = {1, 2};
        int output = 1;

        // When
        int ret = bestTimeToBuyAndSellStock2.maxProfit(prices);

        // Then
        assertEquals(output, ret);
    }

    @Test
    void case5() {
        // Given
        _0122_BestTimeToBuyAndSellStock2 bestTimeToBuyAndSellStock2 = new _0122_BestTimeToBuyAndSellStock2();
        int[] prices = {2, 1, 4};
        int output = 3;

        // When
        int ret = bestTimeToBuyAndSellStock2.maxProfit(prices);

        // Then
        assertEquals(output, ret);
    }
}