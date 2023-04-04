package _0001_0100

class Kt0001TwoSum {
    fun twoSumWithHash(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>();

        for (i in nums.indices)
        {
            if(map.containsKey(nums[i]))
                return intArrayOf(map[nums[i]]!!, i)
            map[target - nums[i]] = i
        }

        return intArrayOf()
    }

    fun twoSum(nums: IntArray, target: Int): IntArray {
        for(i in 0..nums.size-2)
        {
            for(j in i + 1 until nums.size)
            {
                if(target == nums[i] + nums[j])
                    return intArrayOf(i, j)
            }
        }

        return intArrayOf()
    }
}