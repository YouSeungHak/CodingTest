package _0001_0100

class Kt0062UniquePaths {
    private var saveData = Array(100) { IntArray(100) }

    private fun sumPaths(m: Int, n: Int): Int {
        // m이나 n이 1이면 거기까지의 Path 는 1개 밖에 없다.
        if (m == 1 || n == 1) return 1

        // 중간 Path 까지 값이 구해지지 않은 경우에만 Path 값을 구한다.
        if (saveData[m - 1][n - 1] == 0) // 중간 Path 값은 (m-1, n)까지의 Path 의 값과 (m, n-1)까지의 Path 의 값을 합친 것과 같다.
            saveData[m - 1][n - 1] = sumPaths(m - 1, n) + sumPaths(m, n - 1)
        return saveData[m - 1][n - 1]
    }

    fun uniquePaths(m: Int, n: Int): Int {
        return sumPaths(m, n)
    }
}