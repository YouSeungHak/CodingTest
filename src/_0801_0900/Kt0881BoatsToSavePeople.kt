package _0801_0900

class Kt0881BoatsToSavePeople {
    fun numRescueBoats(people: IntArray, limit: Int): Int {
        // 배열 내림차순으로 정렬하기
        val weight = people.sortedArrayDescending()

        // 앞 인덱스와 뒤 인덱스가 같아지는 순간까지 돌리면 된다.
        var count = 0
        var lastIndex = weight.size - 1
        while(count <= lastIndex) {
            if (weight[count] + weight[lastIndex] <= limit) {
                lastIndex--
            }
            count++
        }
        return count
    }
}