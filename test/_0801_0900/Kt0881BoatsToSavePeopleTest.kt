package _0801_0900

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Kt0881BoatsToSavePeopleTest {

    @Test
    fun numRescueBoatsCase1() {
        // Given
        val boatsToSavePeople = Kt0881BoatsToSavePeople()
        val people = intArrayOf(1, 2)
        val limit = 3
        val output = 1

        // When
        val result = boatsToSavePeople.numRescueBoats(people, limit)

        // Then
        Assertions.assertEquals(result, output)
    }

    @Test
    fun numRescueBoatsCase2() {
        // Given
        val boatsToSavePeople = Kt0881BoatsToSavePeople()
        val people = intArrayOf(3, 2, 2, 1)
        val limit = 3
        val output = 3

        // When
        val result = boatsToSavePeople.numRescueBoats(people, limit)

        // Then
        Assertions.assertEquals(result, output)
    }

    @Test
    fun numRescueBoatsCase3() {
        // Given
        val boatsToSavePeople = Kt0881BoatsToSavePeople()
        val people = intArrayOf(3, 5, 3, 4)
        val limit = 5
        val output = 4

        // When
        val result = boatsToSavePeople.numRescueBoats(people, limit)

        // Then
        Assertions.assertEquals(result, output)
    }

    @Test
    fun numRescueBoatsCase4() {
        // Given
        val boatsToSavePeople = Kt0881BoatsToSavePeople()
        val people = intArrayOf(5, 1, 4, 2)
        val limit = 6
        val output = 2

        // When
        val result = boatsToSavePeople.numRescueBoats(people, limit)

        // Then
        Assertions.assertEquals(result, output)
    }


    @Test
    fun numRescueBoatsCase5() {
        // Given
        val boatsToSavePeople = Kt0881BoatsToSavePeople()
        val people = intArrayOf(3, 2, 3, 2, 2)
        val limit = 6
        val output = 3

        // When
        val result = boatsToSavePeople.numRescueBoats(people, limit)

        // Then
        Assertions.assertEquals(result, output)
    }

    @Test
    fun numRescueBoatsCase6() {
        // Given
        val boatsToSavePeople = Kt0881BoatsToSavePeople()
        val people = intArrayOf(5, 1, 7, 4, 2, 4)
        val limit = 7
        val output = 4

        // When
        val result = boatsToSavePeople.numRescueBoats(people, limit)

        // Then
        Assertions.assertEquals(result, output)
    }

    @Test
    fun numRescueBoatsCase7() {
        // Given
        val boatsToSavePeople = Kt0881BoatsToSavePeople()
        val people = intArrayOf(3, 8, 7, 1, 4)
        val limit = 9
        val output = 3

        // When
        val result = boatsToSavePeople.numRescueBoats(people, limit)

        // Then
        Assertions.assertEquals(result, output)
    }
}