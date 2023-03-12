package _0001_0100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _0009_PalindromeNumberTest {

    @Test
    void case1() {
        _0009_PalindromeNumber palindromeNumber = new _0009_PalindromeNumber();
        assertEquals(palindromeNumber.isPalindrome(121),true);
        assertEquals(palindromeNumber.isPalindrome(10),false);
        assertEquals(palindromeNumber.isPalindrome(8),true);
    }

    @Test
    void case2() {
        _0009_PalindromeNumber palindromeNumber = new _0009_PalindromeNumber();
        assertEquals(palindromeNumber.isPalindrome(51231252),false);
        assertEquals(palindromeNumber.isPalindrome(1234321),true);
        assertEquals(palindromeNumber.isPalindrome(-121),false);
    }
}