package easy.twosum;

import java.util.Arrays;

public class TwoSum {
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
    
	public static void main(String[] args) {
		int[] data = {2, 7, 11, 5};
		
		TwoSum twoSum = new TwoSum();
		int[] nums = twoSum.twoSum(data, 9);
		
		System.out.println(Arrays.toString(nums));
	}
}
