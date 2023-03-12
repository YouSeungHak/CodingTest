package _0001_0100;

import java.util.HashMap;
import java.util.Map;

public class _0001_TwoSum {
    public int[] twoSumWithHash(int[] nums, int target) {
        int i;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(i = 0; i < nums.length; i++)
        {
            if(map.containsKey(nums[i]))
            {
                return new int[] {map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }

        return null;
    }

    public int[] twoSum(int[] nums, int target) {
        int i, j;
        int[] answerNums = new int[2];

        for(i = 0; i < (nums.length - 1); i++)
        {
            for(j = (i + 1); j < nums.length; j++)
            {
                if(target == nums[i] + nums[j])
                {
                    answerNums[0] = i;
                    answerNums[1] = j;
                }
            }
        }

        return answerNums;
    }
}
