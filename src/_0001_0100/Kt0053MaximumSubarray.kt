package _0001_0100

class Kt0053MaximumSubarray {
    fun maxSubArray(nums: IntArray): Int {
        var localMax = nums[0]
        var max = nums[0]
        for (i in 1 until nums.size) {
            localMax = (localMax + nums[i]).coerceAtLeast(nums[i])
            max = max.coerceAtLeast(localMax)
        }
        return max
    }
}