package _0001_0100

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class Kt0020ValidParenthesesTest {

    @Test
    fun case1() {
        val validParentheses = Kt0020ValidParentheses()
        assertTrue(validParentheses.isValid("()"))
        assertTrue(validParentheses.isValid("()[]{}"))
        assertFalse(validParentheses.isValid("(]"))
    }
}