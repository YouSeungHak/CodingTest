package easy.twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumHashMap {
    public int[] twoSum(int[] nums, int target) {
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
    
	public static void main(String[] args) {
		int[] data = {2, 7, 11, 5};
		
		TwoSumHashMap twoSumHashMap = new TwoSumHashMap();
		int[] nums = twoSumHashMap.twoSum(data, 9);
		
		System.out.println(Arrays.toString(nums));
	}
}
