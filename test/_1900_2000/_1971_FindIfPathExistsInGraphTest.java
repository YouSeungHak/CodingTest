package _1900_2000;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1971_GivenDataDTO {
    public int n;
    public int[][] edges;
    public int source;
    public int destination;

    _1971_GivenDataDTO(int n, int[][] edges, int source, int  destination) {
        this.n = n;
        this.edges = edges;
        this.source = source;
        this.destination = destination;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[][] getEdges() {
        return edges;
    }

    public void setEdges(int[][] edges) {
        this.edges = edges;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }
}

class _1971_FindIfPathExistsInGraphTest {

    @Test
    void validPathNormal1() {
        // Given
        _1971_FindIfPathExistsInGraph findIfPathExistsInGraph = new _1971_FindIfPathExistsInGraph();
        _1971_GivenDataDTO givenDataDTO = new _1971_GivenDataDTO(
                3,
                new int[][] {{0, 1}, {1, 2}, {2, 0}},
                0,
                2);

        // When
        boolean ret = findIfPathExistsInGraph.validPath(givenDataDTO.getN(), givenDataDTO.getEdges(), givenDataDTO.getSource(), givenDataDTO.getDestination());

        // Then
        assertTrue(ret);
    }

    @Test
    void validPathNormal2() {
        // Given
        _1971_FindIfPathExistsInGraph findIfPathExistsInGraph = new _1971_FindIfPathExistsInGraph();
        _1971_GivenDataDTO givenDataDTO = new _1971_GivenDataDTO(
                6,
                new int[][] {{0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}},
                0,
                5);

        // When
        boolean ret = findIfPathExistsInGraph.validPath(givenDataDTO.getN(), givenDataDTO.getEdges(), givenDataDTO.getSource(), givenDataDTO.getDestination());

        // Then
        assertFalse(ret);
    }

    @Test
    void validPathNormal3() {
        // Given
        _1971_FindIfPathExistsInGraph findIfPathExistsInGraph = new _1971_FindIfPathExistsInGraph();
        _1971_GivenDataDTO givenDataDTO = new _1971_GivenDataDTO(
                3,
                new int[][] {{0, 1}, {1, 2}, {2, 0}},
                0,
                0);

        // When
        boolean ret = findIfPathExistsInGraph.validPath(givenDataDTO.getN(), givenDataDTO.getEdges(), givenDataDTO.getSource(), givenDataDTO.getDestination());

        // Then
        assertTrue(ret);
    }

    @Test
    void validPathDataN1() {
        // Given
        _1971_FindIfPathExistsInGraph findIfPathExistsInGraph = new _1971_FindIfPathExistsInGraph();
        _1971_GivenDataDTO givenDataDTO = new _1971_GivenDataDTO(
                1,
                new int[][] {},
                0,
                5);

        // When
        boolean ret = findIfPathExistsInGraph.validPath(givenDataDTO.getN(), givenDataDTO.getEdges(), givenDataDTO.getSource(), givenDataDTO.getDestination());

        // Then
        assertTrue(ret);
    }
}