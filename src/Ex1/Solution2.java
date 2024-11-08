package Ex1;

// 1. Two Sum - Brute Force
public class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1 + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String[] ags) {
        Solution1 solution = new Solution1();
        int[] nums = {2, 7, 11, 15};
        int target = 18;
        int [] result = solution.twoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
