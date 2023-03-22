package _0001_0100

class Kt0009PalindromeNumber {

    private fun makePowerOfTen(cnt: Int): Int {
        var i = 0
        var ret = 1

        while (i < cnt) {
            ret *= 10
            i++
        }
        return ret
    }

    fun isPalindrome(x: Int): Boolean {
        var cntX = 1
        var ten = 10
        var powerOfTen1 = 0
        var powerOfTen2 = 0
        var num1 = 0
        var num2 = 0

        if(x < 0)
            return false

        if(x == 0)
            return true

        while((x / ten) != 0 && (cntX != 10)) {
            ten *= 10
            cntX++
        }

        if(cntX == 1)
            return true

        powerOfTen1 = makePowerOfTen(cntX - 1)
        powerOfTen2 = makePowerOfTen(1)

        for(i in 0 until cntX /2) {
            if (i == 0) {
                num1 = x / powerOfTen1
                num2 = x % powerOfTen2
            } else {
                num1 = x % (powerOfTen1 * 10) / powerOfTen1
                num2 = x % powerOfTen2 / (powerOfTen2 / 10)
            }

            if (num1 != num2) return false

            powerOfTen1 /= 10
            powerOfTen2 *= 10
        }

        return true
    }
}