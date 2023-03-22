package _1900_2000

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Kt1971FindIfPathExistsInGraphTest {
    internal class Kt1971GivenDataDTO(var n: Int, var edges: Array<IntArray>, var source: Int, var destination: Int)

    @Test
    fun validPathNormal1() {
        // Given
        val findIfPathExistsInGraph = Kt1971FindIfPathExistsInGraph()
        val givenDataDTO = Kt1971GivenDataDTO(
            3, arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(2, 0)),
            0,
            2
        )

        // When
        val ret = findIfPathExistsInGraph.validPath(
            givenDataDTO.n,
            givenDataDTO.edges,
            givenDataDTO.source,
            givenDataDTO.destination
        )

        // Then
        Assertions.assertTrue(ret)
    }

    @Test
    fun validPathNormal2() {
        // Given
        val findIfPathExistsInGraph = Kt1971FindIfPathExistsInGraph()
        val givenDataDTO = Kt1971GivenDataDTO(
            6, arrayOf(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(3, 5), intArrayOf(5, 4), intArrayOf(4, 3)),
            0,
            5
        )

        // When
        val ret = findIfPathExistsInGraph.validPath(
            givenDataDTO.n,
            givenDataDTO.edges,
            givenDataDTO.source,
            givenDataDTO.destination
        )

        // Then
        Assertions.assertFalse(ret)
    }

    @Test
    fun validPathNormal3() {
        // Given
        val findIfPathExistsInGraph = Kt1971FindIfPathExistsInGraph()
        val givenDataDTO = Kt1971GivenDataDTO(
            3, arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(2, 0)),
            0,
            0
        )

        // When
        val ret = findIfPathExistsInGraph.validPath(
            givenDataDTO.n,
            givenDataDTO.edges,
            givenDataDTO.source,
            givenDataDTO.destination
        )

        // Then
        Assertions.assertTrue(ret)
    }

    @Test
    fun validPathDataN1() {
        // Given
        val findIfPathExistsInGraph = Kt1971FindIfPathExistsInGraph()
        val givenDataDTO = Kt1971GivenDataDTO(
            1, arrayOf(),
            0,
            0
        )

        // When
        val ret = findIfPathExistsInGraph.validPath(
            givenDataDTO.n,
            givenDataDTO.edges,
            givenDataDTO.source,
            givenDataDTO.destination
        )

        // Then
        Assertions.assertTrue(ret)
    }
}