package _0201_0300

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test

class Kt0225ImplementStackUsingQueuesTest {
    @Test
    fun case1() {
        val obj = Kt0225ImplementStackUsingQueues()
        obj.push(1)
        obj.push(2)
        assertEquals(obj.top(), 2)
        assertEquals(obj.top(), 2)
        assertFalse(obj.empty())
    }
}