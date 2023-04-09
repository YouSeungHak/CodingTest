package _0001_0100;

// Dynamic Programming
// - 큰 문제를 작은 문제로 쪼개어 해결하고, 한번 풀었던 문제는 어딘가에 저장해 두었다가 반복하여 풀지 않는 것
// Kadane's Algorithm
// - 각각의 최대 부분합은 이전 최대 부분합이 반연된 결과값
// 즉, subarray의 가장 큰 합을 구하는 문제는
// 1. Array의 index를 0부터 N까지 1개씩 합을 더해 가며 부분합을 구한다.
// 2. 현재까지 더한 부분합이 현재의 값보다 작으면 현재의 값을 부분합에 넣는다.
//    (ex) {1, 3, -2, 5} 에서 부분합이 2이고 현재의 값이 5이면 5부터 새로 시작하는 배열을 만드는 것이다.(그게 가장 크다.)
// 3. 최종합은 기존까지의 최종합과 현재 부분합을 비교해서 더 큰 값을 최종합에 넣는다.
// 4. 위를 반복한 뒤 최종합을 리턴한다.

public class _0053_MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int localMax = nums[0];
        int max = nums[0];
        for(int i = 1; i < nums.length; i++) {
            localMax = Math.max(localMax + nums[i], nums[i]);
            max = Math.max(max, localMax);
        }
        return max;
    }
}
