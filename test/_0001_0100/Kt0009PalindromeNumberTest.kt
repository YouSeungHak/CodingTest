package _0001_0100

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Kt0009PalindromeNumberTest {
    @Test
    fun case1() {
        val palindromeNumber = Kt0009PalindromeNumber()
        assertEquals(palindromeNumber.isPalindrome(121), true)
        assertEquals(palindromeNumber.isPalindrome(10), false)
        assertEquals(palindromeNumber.isPalindrome(8), true)
    }

    @Test
    fun case2() {
        val palindromeNumber = Kt0009PalindromeNumber()
        assertEquals(palindromeNumber.isPalindrome(51231252), false)
        assertEquals(palindromeNumber.isPalindrome(1234321), true)
        assertEquals(palindromeNumber.isPalindrome(-121), false)
    }
}