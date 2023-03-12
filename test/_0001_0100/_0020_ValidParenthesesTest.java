package _0001_0100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _0020_ValidParenthesesTest {

    @Test
    void case1() {
        _0020_ValidParentheses validParentheses = new _0020_ValidParentheses();
        assertTrue(validParentheses.isValid("()"));
        assertTrue(validParentheses.isValid("()[]{}"));
        assertFalse(validParentheses.isValid("(]"));
    }
}