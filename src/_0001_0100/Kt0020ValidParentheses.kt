package _0001_0100

import java.util.*

class Kt0020ValidParentheses {
    fun isValid(s: String): Boolean {
        if (s.length % 2 == 1) return false

        val stack = Stack<String>()
        for (i in s.indices) {
            val str = s.substring(i, i + 1)
            if (str == "(" || str == "{" || str == "[") {
                stack.push(str)
                continue
            }
            if (stack.size == 0) return false
            val popStr = stack.pop()
            if (str == ")" && popStr != "(") {
                return false
            } else if (str == "}" && popStr != "{") {
                return false
            } else if (str == "]" && popStr != "[") {
                return false
            }
        }

        return stack.size == 0
    }
}