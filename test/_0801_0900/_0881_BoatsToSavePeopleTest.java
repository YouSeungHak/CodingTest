package _0801_0900;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _0881_BoatsToSavePeopleTest {

    @Test
    void numRescueBoatsCase1() {
        // Given
        _0881_BoatsToSavePeople boatsToSavePeople = new _0881_BoatsToSavePeople();
        int[] people = {1, 2};
        int limit = 3;
        int Output = 1;

        // When
        int result = boatsToSavePeople.numRescueBoats(people, limit);

        // Then
        assertEquals(result, Output);
    }

    @Test
    void numRescueBoatsCase2() {
        // Given
        _0881_BoatsToSavePeople boatsToSavePeople = new _0881_BoatsToSavePeople();
        int[] people = {3, 2, 2, 1};
        int limit = 3;
        int Output = 3;

        // When
        int result = boatsToSavePeople.numRescueBoats(people, limit);

        // Then
        assertEquals(result, Output);
    }

    @Test
    void numRescueBoatsCase3() {
        // Given
        _0881_BoatsToSavePeople boatsToSavePeople = new _0881_BoatsToSavePeople();
        int[] people = {3, 5, 3, 4};
        int limit = 5;
        int Output = 4;

        // When
        int result = boatsToSavePeople.numRescueBoats(people, limit);

        // Then
        assertEquals(result, Output);
    }
}