package _0001_0100;

public class _0062_UniquePaths {

    int[][] saveData = new int[100][100];

    public int sumPaths(int m, int n) {
        if (m == 1 || n == 1)
            return 1;

        if (saveData[m - 1][n - 1] == 0)
            saveData[m - 1][n - 1] = sumPaths(m - 1, n) + sumPaths(m, n - 1);

        return saveData[m - 1][n - 1];
    }

    public int uniquePaths(int m, int n) {
        return sumPaths(m, n);
    }
}

