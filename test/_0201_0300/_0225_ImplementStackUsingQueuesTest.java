package _0201_0300;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _0225_ImplementStackUsingQueuesTest {
    @Test
    void case1() {
        _0225_ImplementStackUsingQueues obj = new _0225_ImplementStackUsingQueues();
        obj.push(1);
        obj.push(2);
        assertEquals(obj.top(), 2);
        assertEquals(obj.top(), 2);
        assertFalse(obj.empty());
    }
}